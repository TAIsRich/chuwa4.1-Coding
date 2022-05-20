package com.example.user.h2.controller;

import com.example.user.h2.exceptions.UserNotFoundException;
import com.example.user.h2.repository.UserRepo;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.servlet.http.HttpServletResponse;

import static java.lang.String.format;

/*@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)*/

/* Reference: https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/
Spring Security Configuration
If you’ve enabled Spring Security in your Spring Boot application, you will
not be able to access the H2 database console. With its default settings under Spring Boot, Spring Security will block access to H2 database console.
To enable access to the H2 database console under Spring Security you need to change three things:
Allow all access to the url path /console/*.
Disable CRSF (Cross-Site Request Forgery). By default, Spring Security will protect against CRSF attacks.
Since the H2 database console runs inside a frame, you need to enable this in in Spring Security.
The following Spring Security Configuration will:
Allow all requests to the root url (“/”) (Line 12)
Allow all requests to the H2 database console url (“/console/*”) (Line 13)
Disable CSRF protection (Line 15)
Disable X-Frame-Options in Spring Security (Line 16)*/

@Configuration
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }

}

    /*private final UserRepo userRepo;
    private final JwtTokenFilter jwtTokenFilter;

    public SpringSecurityConfiguration(UserRepo userRepo, JwtTokenFilter jwtTokenFilter) {
        this.userRepo = userRepo;
        this.jwtTokenFilter = jwtTokenFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http = http.cors().and().csrf().disable();
        //set session management to stateless
        http = http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and();

        //set unauthorized requests exception handler
        http = http
                .exceptionHandling()
                .authenticationEntryPoint(
                        (request, response, ex) -> {
                            response.sendError(
                                    HttpServletResponse.SC_UNAUTHORIZED,
                                    ex.getMessage()
                            );
                        }
                        )
                .and();

        //set permission on endpoints
        http.authorizeRequests()
                .antMatchers("/**").permitAll()
                .antMatchers(HttpMethod.GET, "/users/**").permitAll()
                .antMatchers(HttpMethod.POST, "/users/user/search").permitAll()
                .anyRequest().authenticated();

        //add JWT token filter
        http.addFilterBefore(
                jwtTokenFilter,
                UsernamePasswordAuthenticationFilter.class
        );
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter();//add source or not
    }
    /*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> userRepo
                .findByLogin(username)
                .orElseThrow(
                        ()-> new UserNotFoundException(
                                format("User: %s, not found", username)
                        )
                )
        );
    }*/

    //@Autowired
    //public void configureGlobal(AuthenticationManagerBuilder authenticatinMgr () throws Exception {
    //authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin")
    //.withUser("javainuse").password("javainuse").
    //"ROLE_ADMIN");
/*}
*/