package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/addEmployee", "/h2-console/**/**", "/resources/**", "/employee/**", "/token/**").permitAll()
                .anyRequest().authenticated().and().formLogin().and().authorizeRequests()
                .and().userDetailsService(userDetailsService);

        http.csrf().disable();
        http.headers().frameOptions().disable();

    }
}
