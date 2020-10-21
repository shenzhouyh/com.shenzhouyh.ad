package com.shenzhouyh.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description :
 * @since : 10.7.0
 */
@EnableFeignClients//使用feign访问其他的微服务
@EnableEurekaClient//作为一个eurekaClient存在
@EnableHystrix//使用到的断路器
@EnableCircuitBreaker
@EnableDiscoveryClient//微服务的发现能力
@EnableHystrixDashboard//hystrix的监控
@SpringBootApplication
public class AdSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdSearchApplication.class, args);
    }
}
