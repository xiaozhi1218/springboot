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
 * @date 2020/12/9 12:01
 * @description 标题
 * @package com.itheima.controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //根据ID 获取用户的信息
    @RequestMapping("/{id}")
    public User findById(@PathVariable(name="id") Integer id){
        return userService.findById(id);
    }
}
