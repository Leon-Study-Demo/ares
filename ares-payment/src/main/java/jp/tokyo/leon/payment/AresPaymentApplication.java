package jp.tokyo.leon.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author leon
 * @date 2024/3/2 14:13
 */
@SpringBootApplication
@MapperScan("jp.tokyo.leon.dao.mapper")
@EnableDiscoveryClient
@RefreshScope
public class AresPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresPaymentApplication.class, args);
    }
}
