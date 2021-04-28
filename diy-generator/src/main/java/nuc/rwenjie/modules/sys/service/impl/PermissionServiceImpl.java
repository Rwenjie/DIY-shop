package nuc.rwenjie.modules.sys.service.impl;

import nuc.rwenjie.modules.sys.dataobject.Permission;
import nuc.rwenjie.modules.sys.mapper.PermissionMapper;
import nuc.rwenjie.modules.sys.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
