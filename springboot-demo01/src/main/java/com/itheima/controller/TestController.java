package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 09:10
 * @description 标题
 * @package com.itheima.controller
 */

@RestController//@controller + @responsebody组合组件
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String showHello() {
        return "hello world";
    }
}
