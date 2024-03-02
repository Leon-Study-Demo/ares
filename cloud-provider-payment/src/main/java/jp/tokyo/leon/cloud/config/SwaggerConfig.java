package jp.tokyo.leon.cloud.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon
 * @date 2024/3/2 17:00
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi payApi() {
        return GroupedOpenApi.builder()
                .group("支付微服务模块")
                .pathsToMatch("/pay/**")
                .build();
    }

    @Bean
    public OpenAPI docsOpenApi() {
        return new OpenAPI()
                .info(new Info().title("Ares")
                        .description("Ares REST 接口文档")
                        .version("v1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("www.baidu.com")
                        .url("https://www.baidu.com"));
    }
}
