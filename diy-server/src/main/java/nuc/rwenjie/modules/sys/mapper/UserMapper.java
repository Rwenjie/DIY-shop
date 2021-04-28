package nuc.rwenjie.modules.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import nuc.rwenjie.modules.sys.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Rwenjie
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2021/3/18 14:06
 **/

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
