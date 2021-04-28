package nuc.rwenjie.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import nuc.rwenjie.modules.sys.dataobject.PermissionDO;
import nuc.rwenjie.modules.sys.mapper.PermissionMapper;
import nuc.rwenjie.modules.sys.service.PermissionService;
import nuc.rwenjie.modules.sys.service.model.PermissionModel;
import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Rwenjie
 * @ClassName SysPermissionService
 * @Description TODO 权限列表
 * @Date 2021/3/23 9:55
 **/

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    /**
     * 获取指定角色所有权限
     * @param roleId
     */
    @Override
    public List<PermissionModel> listByRoleId(Integer roleId) {

        List<PermissionDO> permissionDOs = permissionMapper.selectList(new QueryWrapper<PermissionDO>().eq("role_id", roleId));
        List<PermissionModel> permissionModels = new ArrayList<>();
        for (PermissionDO p : permissionDOs) {
            PermissionModel permissionModel = new PermissionModel();
            BeanUtils.copyProperties(p, permissionModel);
            permissionModels.add(permissionModel);

        }
        return permissionModels;
    }

    private PermissionDO convertFromModel(PermissionModel permissionModel) {
        if (permissionModel == null) {
            return null;
        }
        PermissionDO permissionDo = new PermissionDO();
        BeanUtils.copyProperties(permissionModel, permissionDo);
        return permissionDo;
    }

    private PermissionModel convertFromDataObject(PermissionDO permissionDO) {
        if (permissionDO == null) {
            return null;
        }
        PermissionModel PermissionModel = new PermissionModel();
        BeanUtils.copyProperties(permissionDO, PermissionModel);
        return PermissionModel;
    }
}
