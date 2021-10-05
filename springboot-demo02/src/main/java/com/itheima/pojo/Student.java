package com.itheima.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 10:43
 * @description 标题
 * @package com.itheima.pojo
 */

@Component//交给spring容器

//注解的作用：建立映射关系 将yml中的配置属性值 赋值给该注解修饰的类中的field中
// prefix 指定要映射的前缀
@ConfigurationProperties(prefix = "student")
public class Student implements Serializable {
    private Integer age;
    private String sex;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



