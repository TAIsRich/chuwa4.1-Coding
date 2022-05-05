package com.example.user.h2;

import com.example.user.h2.entity.User;
import com.example.user.h2.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepo repo) {
        return args -> {
            log.info("Preloading " + repo.save(new User("Adam", "adam85@gmail.com", "19850123")));
            log.info("Preloading " + repo.save(new User("Alice", "alice82@gmail.com", "19820301")));
            log.info("Preloading " + repo.save(new User("Bobo", "bobo97@gmail.com", "19970805")));
            log.info("Preloading " + repo.save(new User("Becky", "becky95@gmail.com", "19950805")));
        };
    }

}
