package nuc.rwenjie.modules.sys.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.common.utils.SpringBeanFactoryUtils;
import nuc.rwenjie.modules.sys.controller.vo.SpecificationVO;
import nuc.rwenjie.modules.sys.dataobject.SpecificationDO;
import nuc.rwenjie.modules.sys.service.ISpecificationService;
import nuc.rwenjie.modules.sys.service.model.SpecificationModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品规格参数模板，json格式。 前端控制器
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Api(tags = "SpecificationController")
@RestController
@RequestMapping("/specification")
public class SpecificationController {

    @Autowired
    ISpecificationService specificationService;

    @ApiOperation(value = "根据分类获得规格参数模板")
    @GetMapping("get/byCategoryId/{id}")
    public RespBean getSpecificByCategoryId(@PathVariable Long id) {
        SpecificationVO specificationVO = null;
        SpecificationModel specificationModel = specificationService.getSpecificationByCategoryId(id);
        if (specificationModel!=null) {
            specificationVO = this.convertFromVO(specificationModel);
            return RespBean.success("获得成功",specificationVO);
        }
        return RespBean.error("没有获得该分类的规格模板");

    }


    private SpecificationVO convertFromVO(SpecificationModel specificationModel) {
        SpecificationVO specificationVO = new SpecificationVO();
        BeanUtils.copyProperties(specificationModel, specificationVO);
        return specificationVO;
    }
}
