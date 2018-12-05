package com.github.viktorpenelski.demo.config;

import com.github.viktorpenelski.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserInfoConfiguration {

    @Bean
    UserInfo provideDefaultUserInfo() {
        return () -> "Jon Snow";
    }

}
