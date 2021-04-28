package nuc.rwenjie.modules.sys.service.impl;

import nuc.rwenjie.modules.sys.dataobject.Category;
import nuc.rwenjie.modules.sys.mapper.CategoryMapper;
import nuc.rwenjie.modules.sys.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务实现类
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
