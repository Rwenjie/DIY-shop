package nuc.rwenjie.modules.sys.service;

import nuc.rwenjie.modules.sys.service.model.UserRoleModel;

import java.util.List;

/**
 * @Author Rwenjie
 * @ClassName SysUserRoleService
 * @Description TODO
 * @Date 2021/3/23 9:19
 **/


public interface UserRoleService {

    /**
     * 根据用户id查询用户角色
     * @Param: userId
     * @return java.util.List<nuc.rwenjie.modules.sys.entity.SysUserRole>
     **/
    public List<UserRoleModel> listByUserId(String userId);
}
