package com.itheima.pojo;

import java.io.Serializable;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 11:56
 * @description 标题
 * @package com.itheima.pojo
 */
public class User implements Serializable{
    private Integer id;
    private String username;//用户名
    private String password;//密码
    private String name;//姓名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
