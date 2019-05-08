package com.keith.divespringboot.configuare.bootstrap;

import com.keith.divespringboot.configuare.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
public class OnSystemProperyConditionBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "Administrator")
    private String helloWorld(){
        return "HelloWorld keith";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(OnSystemProperyConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //通过类型和名称获取Bean
        String helloWorld=context.getBean("helloWorld",String.class);
        System.out.println("Bean："+helloWorld);
        context.close();
    }
}
