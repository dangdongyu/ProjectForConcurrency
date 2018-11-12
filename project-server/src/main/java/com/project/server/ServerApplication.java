package com.project.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.project"})
@MapperScan("com.project.data.*")
public class ServerApplication {

    public static void main(String[] args) {

//        SpringApplication.run(ServerApplication.class, args);
        Class[] sources = {
                ServerApplication.class
        };
        SpringApplication.run(sources,args);

    }
}
