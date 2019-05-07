package com.keith.divespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.keith.divespringboot.web.servlet")
public class DiveSpringBootApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(DiveSpringBootApplication.class).run(args); 第二种启动方式
		SpringApplication.run(DiveSpringBootApplication.class, args);
	}

}
