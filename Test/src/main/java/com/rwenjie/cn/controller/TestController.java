package com.rwenjie.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Rwenjie
 * @ClassName TestControllrt
 * @Description TODO
 * @Date 2021/5/5 17:38
 **/

@RestController()
@RequestMapping("/w")
public class TestController {

    @GetMapping("/blogInfo")
    public String  test() {
        return "YES";
    }
}
