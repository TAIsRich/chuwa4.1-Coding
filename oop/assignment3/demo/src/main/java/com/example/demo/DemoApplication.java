package com.example.demo;

import com.example.demo.sub1.SpringComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		SpringComponent component = applicationContext.getBean(SpringComponent.class);
		System.out.println(component.getMessage());
	}

}
