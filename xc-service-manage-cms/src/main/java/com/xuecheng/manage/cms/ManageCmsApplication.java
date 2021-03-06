package com.xuecheng.manage.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-12-15
 * Time: 14:10
 */
@EnableEurekaClient
@SpringBootApplication
//扫描实体
@EntityScan("com.xuecheng.framework.domain.cms")
//扫描接口
@ComponentScan(basePackages = "com.xuecheng.api")
@ComponentScan(basePackages = {"com.xuecheng.manage.cms"})
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class, args);
    }
}
