package com.keith.divespringboot.configuare.bootstrap;

import com.keith.divespringboot.configuare.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
@SpringBootApplication(scanBasePackages = "com.keith.divespringboot.configuare.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);
        CalculateService calculateService=context.getBean(CalculateService.class);
        System.out.println("calculateService：sum："+calculateService.sum(1,2,3,4,5,6,7,8,9,10));

        context.close();
    }
}
