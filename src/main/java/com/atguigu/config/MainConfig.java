package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ch
 * @date 2021-2-3
 */
// 配置类 == 配置文件
@Configuration
public class MainConfig {

    // 给容器中注册一个bean；类型为返回值的类型，id默认是用方法名作为id
    @Bean
    public Person person() {
        return new Person("lisi", 20);
    }

}
