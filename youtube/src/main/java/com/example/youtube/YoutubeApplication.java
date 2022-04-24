package com.example.youtube;

import com.example.youtube.sub1.SpringComponents;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class YoutubeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(YoutubeApplication.class, args);
        SpringComponents components = applicationContext.getBean(SpringComponents.class);
        System.out.println(components.getMessage());
    }

}
