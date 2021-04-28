package nuc.rwenjie.modules.sys.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import nuc.rwenjie.modules.sys.dataobject.UserRoleDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {

    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<UserRoleDO> listByUserId(String userId);
}