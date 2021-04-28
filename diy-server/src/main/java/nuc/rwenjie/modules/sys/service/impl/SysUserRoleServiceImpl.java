package nuc.rwenjie.modules.sys.service.impl;

import nuc.rwenjie.common.utils.SpringBeanFactoryUtils;
import nuc.rwenjie.modules.sys.dataobject.RoleDO;
import nuc.rwenjie.modules.sys.dataobject.UserDO;
import nuc.rwenjie.modules.sys.dataobject.UserRoleDO;
import nuc.rwenjie.modules.sys.mapper.UserRoleMapper;
import nuc.rwenjie.modules.sys.service.UserRoleService;
import nuc.rwenjie.modules.sys.service.model.RoleModel;
import nuc.rwenjie.modules.sys.service.model.UserModel;
import nuc.rwenjie.modules.sys.service.model.UserRoleModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Rwenjie
 * @ClassName SysUserRoleServiceImpl
 * @Description TODO 用户角色服务
 * @Date 2021/3/23 9:30
 **/

@Service
public class SysUserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;


    /**
     * 根据用户id查询用户角色
     * @param userId
     * @return java.util.List<nuc.rwenjie.modules.sys.entity.SysUserRole>
     * @Param: userId
     */
    @Override
    public List<UserRoleModel> listByUserId(String userId) {

        List<UserRoleDO> userRoleDOList = userRoleMapper.listByUserId(userId);
        List<UserRoleModel> userRoleModelList = new ArrayList<>();
        for (UserRoleDO userRoleDO : userRoleDOList) {
            UserRoleModel userRoleModel = SpringBeanFactoryUtils.getBean(UserRoleModel.class);
            BeanUtils.copyProperties(userRoleModel, userRoleDO);
            userRoleModelList.add(userRoleModel);
        }
        return userRoleModelList;
    }

    private UserRoleDO convertFromModel(UserRoleModel userRoleModel) {
        if (userRoleModel == null) {
            return null;
        }
        UserRoleDO userRoleDO = SpringBeanFactoryUtils.getBean(UserRoleDO.class);
        BeanUtils.copyProperties(userRoleModel, userRoleDO);
        return userRoleDO;
    }


    private UserRoleModel convertFromDataObject(UserRoleDO userRoleDO) {
        if (userRoleDO == null) {
            return null;
        }
        UserRoleModel userRoleModel = SpringBeanFactoryUtils.getBean(UserRoleModel.class);
        BeanUtils.copyProperties(userRoleDO, userRoleModel);
        return userRoleModel;
    }
}
