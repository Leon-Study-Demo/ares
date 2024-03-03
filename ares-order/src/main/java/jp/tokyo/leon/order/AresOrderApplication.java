package jp.tokyo.leon.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author leon
 * @date 2024/3/2 17:44
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "jp.tokyo.leon.api.feign")
@ComponentScan(basePackages = "jp.tokyo.leon.api")
public class AresOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresOrderApplication.class, args);
    }
}
