package jp.tokyo.leon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author leon
 * @date 2024/3/2 14:13
 */
@SpringBootApplication
@MapperScan("jp.tokyo.leon.cloud.mapper")
public class AresPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresPaymentApplication.class, args);
    }
}
