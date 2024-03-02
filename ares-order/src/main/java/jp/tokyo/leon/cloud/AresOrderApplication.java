package jp.tokyo.leon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author leon
 * @date 2024/3/2 17:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AresOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresOrderApplication.class, args);
    }
}
