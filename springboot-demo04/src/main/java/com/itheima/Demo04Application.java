package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 11:49
 * @description 标题
 * @package com.itheima
 */
@SpringBootApplication
//mapper扫描 指定扫码的包路径

// xml 配置mapperscan 等同
@MapperScan(basePackages = "com.itheima.mapper")
public class Demo04Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo04Application.class,args);
    }
}
