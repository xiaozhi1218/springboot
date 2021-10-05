package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/9 14:44
 * @description 标题
 * @package com.itheima
 */
@SpringBootApplication
public class Demo05Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo05Application.class,args);
    }

    @Bean//xml的配置 注解的配置作用等同于  <bean class="RedisTemplate" name="redisTemplate">
    public RedisTemplate<Object, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        //我要自定义序列化机制 不用默认的jdk
        //template.setKeySerializer(new StringRedisSerializer());
        //template.setValueSerializer(new StringRedisSerializer());

        //key  设置为字符串
        //value 设置为JSON

        //设置自定义的默认的序列化机制
        template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }
}
