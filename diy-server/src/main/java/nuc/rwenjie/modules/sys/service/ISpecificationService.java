package nuc.rwenjie.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.modules.sys.dataobject.SpecificationDO;
import nuc.rwenjie.modules.sys.mapper.SpecificationMapper;
import nuc.rwenjie.modules.sys.service.model.SpecificationModel;

/**
 * <p>
 * 商品规格参数模板，json格式。 服务类
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
public interface ISpecificationService extends IService<SpecificationDO> {

    /**
     * 根据商品的Id获得商品规格参数模板
     * @Param: categoryId
     * @return nuc.rwenjie.modules.sys.service.model.SpecificationModel
     **/
    public SpecificationModel getSpecificationByCategoryId(long categoryId);

    /**
     * 插入Specification
     * @Param: specificationModel
     * @return nuc.rwenjie.common.utils.RespBean
     **/
    public RespBean insertSpecification(SpecificationModel specificationModel);

    /**
     * 更新Specification
     * @Param: specificationModel
     * @return nuc.rwenjie.common.utils.RespBean
     **/
    public RespBean updateSpecification(SpecificationModel specificationModel);

    /**
     * 删除Specification
     * @Param: specificationId
     * @return nuc.rwenjie.common.utils.RespBean
     **/
    public RespBean deleteSpecification(Long specificationId);
}
