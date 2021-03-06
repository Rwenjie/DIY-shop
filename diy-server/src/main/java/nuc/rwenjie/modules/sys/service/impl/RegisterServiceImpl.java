package nuc.rwenjie.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import nuc.rwenjie.modules.sys.dataobject.UserDO;
import nuc.rwenjie.modules.sys.mapper.RegisterMapper;
import nuc.rwenjie.modules.sys.service.AsyncService;
import nuc.rwenjie.modules.sys.service.RegisterService;
import nuc.rwenjie.modules.sys.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author Rwenjie
 * @ClassName RegisterServiceImpl
 * @Description TODO 用户注册
 * @Date 2021/3/20 21:29
 **/


@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    RegisterMapper registerMapper;
    @Autowired
    AsyncService asyncService;

    @Override
    public String userRegister(UserModel userModel){

        UserDO userDO = new UserDO();
        System.out.println("开始用户注册");
        //唯一id
        String id = UUID.randomUUID().toString();
        userDO.setId(id);
        //密码加密
        String password = passwordEncoder.encode(userModel.getPassword());

        //用户注册时间
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        System.out.println(dateStr);


        userDO.setCreatedAt(dateStr);
        userDO.setUpdatedAt(dateStr);
        userDO.setEncrptPassword(password);

        registerMapper.insert(userDO);
        System.out.println("用户注册完成"+userDO);

        return "用户完成注册";
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public int findByPhone(String phone) {
        int phoneNum = registerMapper.selectCount(new QueryWrapper<UserDO>().eq("mobile", phone));
        // 异步把数据库中的手机号存入缓存
        asyncService.insUserPhone();
        return phoneNum;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public int findByUsername(String username) {
        int userNum = registerMapper.selectCount(new QueryWrapper<UserDO>().eq("username", username));
        // 异步把数据库中的用户名存入缓存
        asyncService.insUsername();
        return userNum;
    }

}

