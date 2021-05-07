package nuc.rwenjie.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nuc.rwenjie.modules.sys.dataobject.SpuDO;
import nuc.rwenjie.modules.sys.mapper.SpuMapper;
import nuc.rwenjie.modules.sys.service.ISpuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * spu表，该表描述的是一个抽象的商品，比如 手机 服务实现类
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Service
public class SpuServiceImpl extends ServiceImpl<SpuMapper, SpuDO> implements ISpuService {

}
