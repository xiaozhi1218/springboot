package com.itheima.service.impl;


import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 12:04
 * @description 标题
 * @package com.itheima.service.impl
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public User findById(Integer id) {
        //1.先从redis获取数据，如果有数据 直接返回
        // set key1 value1
        // redisTemplate.boundValueOps("key1").set("value1");

        //get key1 都是字符串
        //redisTemplate.boundValueOps("key1").get();


        User user = (User) redisTemplate.boundValueOps(id.toString()).get();
        if(user!=null){
            System.out.println("哈哈哈，redis中有user对象");
            return user;
        }

        //2.没有数据 模拟从mysql中获取数据(User) 设置到redis中
        User userfromDb = new User();
        userfromDb.setUsername("cxk");
        userfromDb.setId(id);
        userfromDb.setName("lihai");
        userfromDb.setPassword("123456");
        redisTemplate.boundValueOps(id.toString()).set(userfromDb);
        //3.返回给前端
        return userfromDb;
    }
}
