package com.example.user.h2.controller;

import com.example.user.h2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.ModelAndView;


@EnableWebSecurity
public class WebSecurityConfig<bCryptPasswordEncoder> extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    private JdbcUserDetailsManager jdbcUserDetailsManager;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/addEmployee", "/h2-console/**/**", "/resources/**", "/employee/**", "/token/**").permitAll()
                .anyRequest().authenticated().and().formLogin().and().authorizeRequests()
                .and().userDetailsService((org.springframework.security.core.userdetails.UserDetailsService) userDetailsService);
        http.csrf().disable();
        http.headers().frameOptions().disable();
        /*To add Auth support for API */
        String endcodedPassword = bCryptPasswordEncoder.encoder(userRegistrationObject.getPassowrd());

        User user = new User(userRegistrationObject.getUsername(), endcodedPassword, authorities);
        jdbcUserDetailsManager.createUser(user);

        return new ModelAndView("redirect:/welcome");

        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    public class PasswordEncoder {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return new BCryptPasswordEncoder();
    }



}
