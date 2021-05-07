package com.rwenjie.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Rwenjie
 * @ClassName App
 * @Description TODO main
 * @Date 2021/5/5 17:37
 **/

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        //测试 git GitHub
        SpringApplication.run(App.class, args);
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println("______________________________________________________________________________________________________________________________启动时间: " + ft.format(dNow));
    }
}
