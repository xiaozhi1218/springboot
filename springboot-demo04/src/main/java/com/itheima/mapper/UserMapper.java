package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 11:50
 * @description 标题
 * @package com.itheima.mapper
 */
public interface UserMapper {

    public User findById(Integer id);

    public List<User> findAll();
}
