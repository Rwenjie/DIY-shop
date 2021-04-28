package nuc.rwenjie.modules.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import nuc.rwenjie.modules.sys.dataobject.RoleDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper extends BaseMapper<RoleDO> {
  /*  @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);

    @Select("SELECT * FROM sys_role WHERE name = #{roleName}")
    SysRole selectByName(String roleName);*/
}
