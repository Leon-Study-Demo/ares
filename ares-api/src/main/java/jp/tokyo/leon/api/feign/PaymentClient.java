package jp.tokyo.leon.api.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author leon
 * @date 2024/3/3 12:17
 */
@FeignClient(value = "ares-payment-service")
public interface PaymentClient {

//    public ResponseResult<PayResponseDTO>
}
