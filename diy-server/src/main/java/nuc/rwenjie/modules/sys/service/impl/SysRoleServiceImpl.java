package nuc.rwenjie.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import nuc.rwenjie.common.utils.SpringBeanFactoryUtils;
import nuc.rwenjie.modules.sys.dataobject.RoleDO;
import nuc.rwenjie.modules.sys.mapper.RoleMapper;
import nuc.rwenjie.modules.sys.service.RoleService;
import nuc.rwenjie.modules.sys.service.model.RoleModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Rwenjie
 * @ClassName SysRoleServiceImpl
 * @Description TODO 用户角色
 * @Date 2021/3/23 10:02
 **/

@Service
public class SysRoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    /**
     * 根据角色id获得角色
     *
     * @param roleId
     * @return nuc.rwenjie.modules.sys.entity.SysRole
     * @Param: id
     */
    @Override
    public RoleModel getRoleById(Integer roleId) {
        RoleModel roleModel = SpringBeanFactoryUtils.getBean(RoleModel.class);
        RoleDO roleDO = roleMapper.selectOne(new QueryWrapper<RoleDO>().eq("id", roleId));
        if (roleDO!=null){
            BeanUtils.copyProperties(roleDO, roleModel);
        }
        return roleModel;
    }

    /**
     * 根据角色名获得角色
     *
     * @param roleName
     * @return nuc.rwenjie.modules.sys.entity.SysRole
     * @Param: roleName
     */
    @Override
    public RoleModel getRoleByName(String roleName) {
        RoleModel roleModel = SpringBeanFactoryUtils.getBean(RoleModel.class);
        RoleDO roleDO = roleMapper.selectOne(new QueryWrapper<RoleDO>().eq("name", roleName));
        if (roleDO!=null){
            BeanUtils.copyProperties(roleDO, roleModel);
        }
        return roleModel;
    }


    private RoleDO convertFromModel(RoleModel roleModel) {
        if (roleModel == null) {
            return null;
        }
        RoleDO roleDO = new RoleDO();
        BeanUtils.copyProperties(roleModel, roleDO);
        return roleDO;
    }


    private RoleModel convertFromDataObject(RoleDO roleDO) {
        if (roleDO == null) {
            return null;
        }
        RoleModel roleModel = new RoleModel();
        BeanUtils.copyProperties(roleDO, roleModel);
        return roleModel;
    }
}
