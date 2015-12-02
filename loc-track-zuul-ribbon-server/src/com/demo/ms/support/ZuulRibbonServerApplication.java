package com.demo.ms.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class ZuulRibbonServerApplication {
	
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulRibbonServerApplication.class).web(true).run(args);
    }
}