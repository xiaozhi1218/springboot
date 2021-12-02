package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 12:04
 * @description 标题
 * @package com.itheima.service
 */
public interface UserService {
    //alt + enter
    User findById(Integer id);

    List<User> findAll();
}
