package com.example.user.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder());
    }

    @Bean
    public JdbcUserDetailsManager jdbcUserDetailsManager() throws Exception {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
        jdbcUserDetailsManager.setDataSource(dataSource);
        return jdbcUserDetailsManager;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resrouces/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        () -> http.authorizeRequests().antMatchers("/register").permitAll().antMatchers().permitAll("/welcome")
                .hasAnyRole("USER", "ADMIN").antMatchers("/getUser").hasAnyRole("USER", "ADMIN")
                .antMatchers("/addNewUser").hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
                .loginPage("/login").permitAll().and().logout().permitAll();
        http.csrf().disable();
    }


    //@Autowired
    //public void configureGlobal(AuthenticationManagerBuilder authenticatinMgr () throws Exception {
    //authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin")
    //.withUser("javainuse").password("javainuse").
    //"ROLE_ADMIN");
}
