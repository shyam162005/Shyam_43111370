package com.example.financetracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                // allow frontend
                .requestMatchers(
                        "/",
                        "/index.html",
                        "/frontend/**",
                        "/css/**",
                        "/js/**"
                ).permitAll()

                // allow APIs
                .requestMatchers("/api/**").permitAll()

                .anyRequest().permitAll()
            );

        return http.build();
    }

    // ✅ REQUIRED for UserService
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
