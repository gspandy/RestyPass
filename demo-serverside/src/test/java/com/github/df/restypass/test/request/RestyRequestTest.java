package com.github.df.restypass.test.request;

import com.github.df.restypass.spring.EnableRestyPass;
import com.github.df.restypass.test.service.ProxyService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by darrenfu on 17-7-29.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestyRequestTest.Application.class)
//@WebAppConfiguration
@ActiveProfiles("unit_test")
@TestPropertySource(properties = {"test.expire.cache=test"})
public class RestyRequestTest {

    @SpringBootApplication
//    @ComponentScan(basePackages = {"df.open"})
    @EnableRestyPass(basePackages = {"com.github.df.restypass.test"})
    public static class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }


    @Autowired
    private ProxyService proxyService;

    @Test
    @Ignore
    public void testProxyGetNothing() {

        proxyService.getNothing();
    }

}
