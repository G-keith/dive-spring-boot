package com.keith.divespringboot.configuare.configuratrion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-07
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){//方法即bean名称
        return "Hello,World 2019";
    }
}
