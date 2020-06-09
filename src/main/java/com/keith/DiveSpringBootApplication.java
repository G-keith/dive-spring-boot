package com.keith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author gemi
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.keith.divespringboot.web.servlet")
public class DiveSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiveSpringBootApplication.class, args);
	}

}
