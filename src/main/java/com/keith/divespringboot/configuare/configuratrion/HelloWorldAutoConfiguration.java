package com.keith.divespringboot.configuare.configuratrion;

import com.keith.divespringboot.configuare.annotation.EnableHelloWorld;
import com.keith.divespringboot.configuare.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld自动装配
 * @author keith
 * @version 1.0
 * @date 2019-05-10
 */
@Configuration //Spring模式注解装配
@EnableHelloWorld  //Spring @Enable装配
@ConditionalOnSystemProperty(name = "user.name",value = "Administrator")    //Spring 条件装配
public class HelloWorldAutoConfiguration {
}
