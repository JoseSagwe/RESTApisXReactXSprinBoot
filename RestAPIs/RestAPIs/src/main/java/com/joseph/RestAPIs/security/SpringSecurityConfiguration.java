package com.joseph.RestAPIs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    //Filter chain
    // authenticate all requests
    //basic authentication
    //disabling csrf
    //stateless rest api
    @Bean
    //Filter chain
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //1: Response to preflight request doesn't pass access control check

        //2: basic auth
                http.authorizeHttpRequests(
                                auth ->
                                        auth
                                        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                                        .anyRequest().authenticated()
                                    );

                        //basic authentication to show pop up for authentication
                        http.httpBasic(Customizer.withDefaults());

//                        stateless rest api ( not working with sessions)
                        http.sessionManagement(
                                session -> session.sessionCreationPolicy
                                        (SessionCreationPolicy.STATELESS));

                        //disabling csrf for stateless Rest Api
                        http.csrf().disable();

                        return http.build();
    }

}