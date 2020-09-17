package com.imooc.luckymoney;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.management.ValueExp;
import java.math.BigDecimal;

/**
 * @Program: luckymoney1
 * @ClassName: HelloController
 * @Description: TODD
 * @Author: Administrator
 * @Date: 2020/9/16
 * @Controller + @ResponseBody = @RestController
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    //1、@GetMapping("/say/{id}") + @PathVariable("id") Integer age        -----http://localhost:8081/luckymoney/hello/say/320
    //2、@GetMapping("/say") + @RequestParam(value = "id",required = false,defaultValue = "0") Integer age        -----http://localhost:8081/luckymoney/hello/say
    //关于get请求方式，1跟2的方式都可以
    //@PostMapping("/say")
    //3、@GetMapping("/say") + @PostMapping("/say") = @RequestMapping("/say")
    @GetMapping("/say")
//    @RequestMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer age) {
//        System.out.println("跟慕课网廖师兄学springboot。");
//        return "跟慕课网廖师兄学springboot。";
//        return "说明：" + limitConfig.getDescription();
//        return "index";
        return "id = " + age;
    }
}
