package com.github.viktorpenelski.library.config;

import com.github.viktorpenelski.UserInfo;

class DefaultUserInfo implements UserInfo {

    @Override
    public String getInfo() {
        return "Jaqen H'ghar";
    }
}
