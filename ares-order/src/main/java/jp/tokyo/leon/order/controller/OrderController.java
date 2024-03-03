package jp.tokyo.leon.order.controller;

import jakarta.annotation.Resource;
import jp.tokyo.leon.api.dto.response.PayResponseDTO;
import jp.tokyo.leon.api.feign.PaymentClient;
import jp.tokyo.leon.api.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leon
 * @date 2024/3/2 17:51
 */
@RestController
public class OrderController {

    @Resource
    private PaymentClient paymentClient;


    @GetMapping("/consumer/pay/get/{id}")
    public ResponseResult<PayResponseDTO> getOrder(@PathVariable("id") Integer id) {
        return paymentClient.getPayInfo(id);
    }
}
