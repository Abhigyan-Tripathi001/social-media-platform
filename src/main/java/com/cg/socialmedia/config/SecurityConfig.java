package com.cg.socialmedia.config;

import com.cg.socialmedia.security.JwtFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/**").permitAll()
                .requestMatchers("/home", "/css/**").permitAll()
 
                 //  ADD THESE
                .requestMatchers("/users", "/posts",
                                 "/comments/**",
                                 "/friends/**",
                                 "/notifications/**").permitAll()

                .anyRequest().authenticated()   //  NOW PROTECTED
            )
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
            .formLogin(form -> form.disable())
            .httpBasic(basic -> basic.disable());

        return http.build();
    }
}
//package com.cg.socialmedia.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http
//            .csrf(csrf -> csrf.disable())   //  VERY IMPORTANT
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/auth/**").permitAll()   //  allow all auth APIs
//                .requestMatchers("/home", "/css/**").permitAll()
//                .anyRequest().permitAll()   //  TEMP allow all (for testing)
//            )
//            .formLogin(form -> form.disable())   //  disable login page
//            .httpBasic(basic -> basic.disable()); //  disable basic auth
//
//        return http.build();
//    }
//}