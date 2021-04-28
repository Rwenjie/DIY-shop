package nuc.rwenjie.modules.sys.mapper;

import nuc.rwenjie.modules.sys.dataobject.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 Mapper 接口
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
public interface CategoryMapper extends BaseMapper<Category> {

}
