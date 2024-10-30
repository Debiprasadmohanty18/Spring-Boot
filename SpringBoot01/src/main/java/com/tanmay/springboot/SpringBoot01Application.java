package com.tanmay.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  // @ComponentScan + @EnableAutoConfiguration
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringBoot01Application.class, args); // Return type of this "run" method is "ConfigurableApplicationContext"
		
		int beanCount = con.getBeanDefinitionCount(); // By default, 52 beans will be there in a springboot-starter project.
		System.out.println("Total Beans :- "+ beanCount);  // In this case, Output will be "53" because we have created one as @Service.
	}

}
