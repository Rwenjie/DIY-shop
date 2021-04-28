package nuc.rwenjie.common.config.security;

import lombok.SneakyThrows;
import nuc.rwenjie.modules.sys.service.RoleService;
import nuc.rwenjie.modules.sys.service.UserRoleService;
import nuc.rwenjie.modules.sys.service.UserService;
import nuc.rwenjie.modules.sys.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 默认 UserDetailService，通过用户名读取信息
 * @author jitwxs
 * @since 2019/1/8 23:34
 */
@Service
public class DefaultUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserRoleService userRoleService;

    @SneakyThrows
    @Override
    public UserModel loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("密码登录开始验证");
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息 账号密码登录实际上用的时手机号密码登录
        UserModel user = userService.getUserByMobile(username);

        System.out.println(user.toString());
        // 判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        // 添加权限
      /*  List<SysUserRole> userRoles = userRoleService.listByUserId(user.getId());
        for (SysUserRole userRole : userRoles) {
            SysRole role = roleService.getRoleById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }*/
        // 返回UserDetails实现类

        return user;
    }
}
