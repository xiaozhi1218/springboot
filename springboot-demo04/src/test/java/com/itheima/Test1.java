package com.itheima;

import com.itheima.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 12:15
 * @description 标题
 * @package com.itheima
 */
//如果 测试类不和启动类包路径一致 以及子包下 需要指定classes 指定的启动类的字节码对象
@SpringBootTest(classes = Demo04Application.class)
@RunWith(SpringRunner.class)
public class Test1 {

    @Autowired
    private UserMapper userMapper;

    //测试 mybatis 的mapper
    @Test
    public void findByIdTest(){
        System.out.println(userMapper.findById(1).getName());
    }

}
