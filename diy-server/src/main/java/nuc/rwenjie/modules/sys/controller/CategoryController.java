package nuc.rwenjie.modules.sys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.common.utils.SpringBeanFactoryUtils;
import nuc.rwenjie.modules.sys.controller.vo.CategoryVO;
import nuc.rwenjie.modules.sys.dataobject.CategoryDO;
import nuc.rwenjie.modules.sys.dataobject.UserDO;
import nuc.rwenjie.modules.sys.service.CategoryService;
import nuc.rwenjie.modules.sys.service.model.CategoryModel;
import nuc.rwenjie.modules.sys.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static nuc.rwenjie.common.constant.Constant.ROOT_PARENT_ID;

/**
 * @Author Rwenjie
 * @ClassName CategoryController
 * @Description TODO 查询分类
 * @Date 2021/4/27 13:31
 **/

@Api(tags = "CategoryController")
@RestController
@RequestMapping("/category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "获得分类信息")
    @GetMapping("/listing")
    public RespBean selectAll() {
        List<CategoryModel> categoryModelList = categoryService.selectAll();
        return RespBean.success("获取成功", categoryModelList);
    }
    private void findSubCategory(List<CategoryVO> categoryVOList, List<CategoryModel> categoryModelList) {
        for (CategoryVO categoryVO : categoryVOList) {
            List<CategoryVO> subCategoryVOList = new ArrayList<>();
            for (CategoryModel categoryModel : categoryModelList) {
                //如果查到内容，设置subCategory, 继续往下查
                System.out.println(categoryVO.getValue());
                if(categoryModel.getChildren().size()!=0){
                    findSubCategory(subCategoryVOList, categoryModel.getChildren());
                }
                if (categoryVO.getValue()==categoryModel.getParentId()) {
                    System.out.println(2);
                    CategoryVO subCategoryVO = convertFromVO(categoryModel);
                    subCategoryVOList.add(subCategoryVO);
                }
                categoryVO.setChildren(subCategoryVOList);
            }
        }
    }
    private CategoryVO convertFromVO(CategoryModel categoryModel) {

        if (categoryModel == null) {
            return null;
        }
        CategoryVO categoryVO=new CategoryVO();
        categoryVO.setLabel(categoryModel.getName());
        categoryVO.setValue(categoryModel.getId());
        return categoryVO;
    }
}
