package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 14:47
 * @description 标题
 * @package com.itheima.controller
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getInfo/{id}")
    public User findById(@PathVariable(name="id") Integer id){
        return userService.findById(id);
    }
}
