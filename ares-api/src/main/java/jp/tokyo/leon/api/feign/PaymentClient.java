package jp.tokyo.leon.api.feign;

import jp.tokyo.leon.api.dto.response.PayResponseDTO;
import jp.tokyo.leon.api.response.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author leon
 * @date 2024/3/3 12:17
 */
@FeignClient(value = "ares-payment-service")
public interface PaymentClient {

    @GetMapping("/pay/get/{id}")
    ResponseResult<PayResponseDTO> getPayInfo(@PathVariable("id") Integer id);
}
