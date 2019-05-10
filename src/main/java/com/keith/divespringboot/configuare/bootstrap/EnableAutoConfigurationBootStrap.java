package com.keith.divespringboot.configuare.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-10
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=new SpringApplicationBuilder(EnableAutoConfigurationBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld=context.getBean("helloWorld",String.class);
        System.out.println("Bean："+helloWorld);

        //关闭上下文
        context.close();
    }
}
