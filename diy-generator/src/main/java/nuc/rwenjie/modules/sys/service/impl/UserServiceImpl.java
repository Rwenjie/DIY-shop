package nuc.rwenjie.modules.sys.service.impl;

import nuc.rwenjie.modules.sys.dataobject.User;
import nuc.rwenjie.modules.sys.mapper.UserMapper;
import nuc.rwenjie.modules.sys.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
