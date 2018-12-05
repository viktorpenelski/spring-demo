package com.github.viktorpenelski.demo.config;

import com.github.viktorpenelski.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsefulController {

    private UserInfo userInfo;

    public UsefulController(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @GetMapping
    public String properConfiguration() {
        return userInfo.getInfo();
    }
}
