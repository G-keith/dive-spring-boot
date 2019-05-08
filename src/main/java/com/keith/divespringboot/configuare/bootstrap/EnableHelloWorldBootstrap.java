package com.keith.divespringboot.configuare.bootstrap;

import com.keith.divespringboot.configuare.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=new SpringApplicationBuilder(RepositoryBootstrap.class).web(WebApplicationType.NONE).run(args);
        String helloWorld=context.getBean("helloWorld",String.class);
        System.out.println("Bean："+helloWorld);

        context.close();
    }

}
