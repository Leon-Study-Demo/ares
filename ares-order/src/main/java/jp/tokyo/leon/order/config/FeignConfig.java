package jp.tokyo.leon.order.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon
 * @date 2024/3/3 20:38
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer retryer() {
        return Retryer.NEVER_RETRY; // 默认不重试
        // 最大的请求次数（1 + 2），初始间隔时间 100ms， 最大间隔时间1s
        // return new Retryer.Default(100, 1, 3);
    }
}
