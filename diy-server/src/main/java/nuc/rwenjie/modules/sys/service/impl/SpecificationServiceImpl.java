package nuc.rwenjie.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.common.utils.SpringBeanFactoryUtils;
import nuc.rwenjie.modules.sys.dataobject.CategoryDO;
import nuc.rwenjie.modules.sys.dataobject.RoleDO;
import nuc.rwenjie.modules.sys.dataobject.SpecificationDO;
import nuc.rwenjie.modules.sys.mapper.SpecificationMapper;
import nuc.rwenjie.modules.sys.service.ISpecificationService;
import nuc.rwenjie.modules.sys.service.model.CategoryModel;
import nuc.rwenjie.modules.sys.service.model.RoleModel;
import nuc.rwenjie.modules.sys.service.model.SpecificationModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 商品规格参数模板，json格式。 服务实现类
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Service
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, SpecificationDO> implements ISpecificationService {

    @Resource
    SpecificationMapper specificationMapper;

    /**
     * 根据商品的Id获得商品规格参数模板
     *
     * @param categoryId
     * @return nuc.rwenjie.modules.sys.service.model.SpecificationModel
     * @Param: categoryId
     */

    @Override
    public SpecificationModel getSpecificationByCategoryId(long categoryId) {
        SpecificationDO specificationDO = specificationMapper.selectOne(new QueryWrapper<SpecificationDO>().eq("category_id",categoryId));
        if (specificationDO==null) {
            return null;
        }
        SpecificationModel specificationModel = this.convertFromDataObject(specificationDO);
        BeanUtils.copyProperties(specificationDO, specificationModel);
        return specificationModel;
    }

    /**
     * 插入Specification
     *
     * @param specificationModel
     * @return nuc.rwenjie.common.utils.RespBean
     * @Param: specificationModel
     */
    @Override
    public RespBean insertSpecification(SpecificationModel specificationModel) {
        return null;
    }

    /**
     * 更新Specification
     *
     * @param specificationModel
     * @return nuc.rwenjie.common.utils.RespBean
     * @Param: specificationModel
     */
    @Override
    public RespBean updateSpecification(SpecificationModel specificationModel) {
        return null;
    }

    /**
     * 删除Specification
     *
     * @param specificationId
     * @return nuc.rwenjie.common.utils.RespBean
     * @Param: specificationId
     */
    @Override
    public RespBean deleteSpecification(Long specificationId) {
        return null;
    }

    private SpecificationModel convertFromDataObject(SpecificationDO specificationDO) {
        SpecificationModel specificationModel = new SpecificationModel();
        BeanUtils.copyProperties(specificationDO, specificationModel);
        return specificationModel;
    }
}
