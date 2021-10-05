package com.itheima.controller;

import com.itheima.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 10:15
 * @description 标题
 * @package com.itheima.controller
 */
@RestController
@RequestMapping("/test")
public class TestController {

    //通过value注解获取yml中的key的值  获取简单的数据类型 （value注解只能获取简单的数据类型的值）
    @Value("${studentname}")
    private String name;

    //获取年龄
    @Value("${student.age}")
    private Integer age;

    //获取城市
    @Value("${cities[1]}")
    private String city;

    //获取性别
    @Value("${students[1].sex}")
    private String sex;

    //获取mysql中url
    @Value("${mysql.url}")
    private String url;


    //通过environment 获取属性值
    @Autowired
    private Environment environment;

    @Autowired
    private Student student;


    @RequestMapping("/hello")
    public String show() {
        //1.需要读取yml中的key的值 再返回？
        System.out.println("获取到的名称是："+name+"年龄："+age+"城市:"+city+"性别："+sex+"地址："+url);

        //2.通过environment获取
        String value = environment.getProperty("studentname");
        String name = environment.getProperty("student.name");
        System.out.println("=========================================");
        System.out.println("environement方式获取值:"+name+value);


        System.out.println("==============分隔先=============");

        System.out.println(student.getAge()+":"+ student.getName());


        return "hello world";
    }


}
