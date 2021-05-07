package nuc.rwenjie.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nuc.rwenjie.modules.sys.dataobject.SkuDO;
import nuc.rwenjie.modules.sys.mapper.SkuMapper;
import nuc.rwenjie.modules.sys.service.ISkuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * sku表,该表表示具体的商品实体,如黑色的64GB的iphone 8 服务实现类
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, SkuDO> implements ISkuService {

}
