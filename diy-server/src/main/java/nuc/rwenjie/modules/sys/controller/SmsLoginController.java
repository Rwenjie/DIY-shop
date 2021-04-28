package nuc.rwenjie.modules.sys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.common.utils.ali.phoneVerify.pojo.SMSResponse;
import nuc.rwenjie.common.utils.ali.phoneVerify.service.SMSService;
import nuc.rwenjie.modules.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author Rwenjie
 * @ClassName smsController
 * @Description TODO 短信验证
 * @Date 2021/3/19 22:10
 **/

@Api(tags = "SmsLoginController")
@RestController
public class SmsLoginController {
    @Autowired
    SMSService smsService;
    @ApiOperation(value = "获得短信验证码")
    @GetMapping("/sms/code")
    @ResponseBody
/*    public RespBean sms(String mobile, HttpSession session) {
        int code = (int) Math.ceil(Math.random() * 9000 + 1000);

        Map<String, Object> map = new HashMap<>(16);
        map.put("mobile", mobile);
        map.put("code", code);

        session.setAttribute("smsCode", map);

        System.out.println("{"+session.getId()+"}：为 {"+mobile+"} 设置短信验证码：{"+code+"}");
        return RespBean.success("获得验证码", code);

    }*/
    public RespBean sms(String mobile, HttpSession session) {

        System.out.println("获取验证码");
        SMSResponse sms = smsService.sendMessModel(mobile, 1);
        System.out.println("s"+sms);
        System.out.println("成功"+sms.getCode());
        if(sms.getCode().equals("OK")) {
            return RespBean.success("获取验证码成功");
        } else {
            return RespBean.error("获取验证码失败");
        }
    }

    @Autowired
    UserService userService;

/*    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/sms/login")
    public RespBean login(String mobile, String smsCode, HttpServletRequest request) {
        return userService.smsLogin(mobile,  request);
    }*/


}


