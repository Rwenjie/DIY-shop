package nuc.rwenjie.modules.sys.controller;

import nuc.rwenjie.common.utils.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Rwenjie
 * @ClassName Test
 * @Description TODO
 * @Date 2021/5/5 17:19
 **/

@RestController()
@RequestMapping("/w")
public class Test {

    @GetMapping("/blogInfo")
    public RespBean test() {
        return RespBean.success("成功");
    }

}
