package com.keith.divespringboot.configuare.bootstrap;

import com.keith.divespringboot.configuare.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-07
 */
@ComponentScan("com.keith.divespringboot.configuare.repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(RepositoryBootstrap.class).web(WebApplicationType.NONE).run(args);

        //检验bean是否存在
        MyFirstLevelRepository myFirstLevelRepository=context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        System.out.println(myFirstLevelRepository.toString());
        context.close();
    }
}
