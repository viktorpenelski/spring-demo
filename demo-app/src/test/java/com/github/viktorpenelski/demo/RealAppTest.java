package com.github.viktorpenelski.demo;

import com.github.viktorpenelski.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RealApplication.class)
public class RealAppTest {
    @Autowired
    UserInfo userInfo;

    @Test
    public void contextLoads() {
        Assert.assertEquals("Jon Snow", userInfo.getInfo());
    }

}

