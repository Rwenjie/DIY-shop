package nuc.rwenjie.modules.sys.service.impl;

import lombok.extern.slf4j.Slf4j;
import nuc.rwenjie.common.config.jwt.JwtTokenUtil;
import nuc.rwenjie.common.config.security.DefaultUserDetailsService;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.modules.sys.mapper.UserMapper;
import nuc.rwenjie.modules.sys.service.LoginService;
import nuc.rwenjie.modules.sys.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Rwenjie
 * @ClassName LoginServiceImpl
 * @Description TODO 用户登录
 * @Date 2021/3/24 19:15
 **/

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    DefaultUserDetailsService userDetailsService;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @Autowired
    PasswordEncoder passwordEncoder;


    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public RespBean login(String username, String password) {

        System.out.println("LoginServiceImpl=>用户登录"+username);
        UserModel user = userDetailsService.loadUserByUsername(username);

  /*      if (null==user||!passwordEncoder.matches(password, user.getPassword())) {
            return RespBean.error("用户名或密码不正确");
        }
        if (!user.isEnabled()) {
            return RespBean.error("账号被禁用,请联系管理员!");
        }*/

        //更新security登录对象
        UsernamePasswordAuthenticationToken authenticationToken = new
                UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生产token
        String token = jwtTokenUtil.generateToken(user);
        System.out.println(token);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return RespBean.success("登录成功", tokenMap);
    }

    /**
     * 短信验证 登录之后返回token
     *
     * @param mobile
     * @return com.rwenjie.server.pojo.RespBean
     * @Param: username
     * @Param: password
     * @Param: request
     */
     @Override
     public RespBean smsLogin(String mobile, String smsCode) {

         System.out.println("LoginServiceImpl=>短信验证码:mobile:"+mobile);
         UserModel user = userDetailsService.loadUserByUsername(mobile);

        //更新security登录对象
         UsernamePasswordAuthenticationToken authenticationToken = new
                 UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
         SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生成 token
        String token = jwtTokenUtil.generateToken(user);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);

        return RespBean.success("登录成功", tokenMap);
    }

}
