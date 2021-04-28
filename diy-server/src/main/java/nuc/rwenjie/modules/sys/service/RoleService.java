package nuc.rwenjie.modules.sys.service;

import nuc.rwenjie.modules.sys.service.model.RoleModel;

/**
 * @Author Rwenjie
 * @ClassName SysRoleService
 * @Description TODO
 * @Date 2021/3/23 9:18
 **/


public interface RoleService {

    /**
     * 根据角色id获得角色
     * @Param: id
     * @return nuc.rwenjie.modules.sys.entity.SysRole
     **/
    public RoleModel getRoleById(Integer roleId);

    /**
     * 根据角色名获得角色
     * @Param: roleName
     * @return nuc.rwenjie.modules.sys.entity.SysRole
     **/
    public RoleModel getRoleByName(String roleName);
}
