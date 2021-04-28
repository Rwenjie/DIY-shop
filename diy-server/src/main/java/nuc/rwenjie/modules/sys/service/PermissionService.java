package nuc.rwenjie.modules.sys.service;

import nuc.rwenjie.modules.sys.service.model.PermissionModel;

import java.util.List;

/**
 * @Author Rwenjie
 * @ClassName SysPermissionService
 * @Description TODO
 * @Date 2021/3/23 9:17
 **/


public interface PermissionService {

    /**
     * 获取指定角色所有权限
     */
    List<PermissionModel> listByRoleId(Integer roleId);

}
