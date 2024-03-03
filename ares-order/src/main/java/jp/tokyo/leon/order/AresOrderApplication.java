package jp.tokyo.leon.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author leon
 * @date 2024/3/2 17:44
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AresOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresOrderApplication.class, args);
    }
}
