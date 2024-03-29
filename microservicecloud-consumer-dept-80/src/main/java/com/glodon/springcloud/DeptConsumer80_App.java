package com.glodon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：renc
 * @date ：Created in 2019/7/8 10:27
 * @description：${description}
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DeptConsumer80_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
