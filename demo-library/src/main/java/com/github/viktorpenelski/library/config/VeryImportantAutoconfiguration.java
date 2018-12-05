package com.github.viktorpenelski.library.config;

import com.github.viktorpenelski.UserInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class VeryImportantAutoconfiguration {

    @Bean
    @ConditionalOnMissingBean
    UserInfo provideDefaultUserInfo() {
        return new DefaultUserInfo();
    }

}
