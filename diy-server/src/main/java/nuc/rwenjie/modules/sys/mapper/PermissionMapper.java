package nuc.rwenjie.modules.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import nuc.rwenjie.modules.sys.dataobject.PermissionDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermissionMapper extends BaseMapper<PermissionDO> {
    @Select("SELECT * FROM sys_permission WHERE role_id=#{roleId}")
    List<PermissionDO> listByRoleId(Integer roleId);
}
