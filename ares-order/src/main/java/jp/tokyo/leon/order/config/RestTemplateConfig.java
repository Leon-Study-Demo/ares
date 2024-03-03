package jp.tokyo.leon.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author leon
 * @date 2024/3/2 17:50
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced // 不加注解 一个节点服务会报错
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
