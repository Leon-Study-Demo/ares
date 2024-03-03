package jp.tokyo.leon.order.controller;

import jakarta.annotation.Resource;
import jp.tokyo.leon.api.dto.request.PayRequestDTO;
import jp.tokyo.leon.api.dto.response.PayResponseDTO;
import jp.tokyo.leon.api.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author leon
 * @date 2024/3/2 17:51
 */
@RestController
public class OrderController {
    public static final String PAYMENT_SERVICE_URL = "http://ares-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/pay/add")
    public ResponseResult<String> addOrder(PayRequestDTO payDTO) {
        return restTemplate.postForObject(PAYMENT_SERVICE_URL + "/pay/add", payDTO, ResponseResult.class);
    }

    @GetMapping("/consumer/pay/get/{id}")
    public ResponseResult<PayResponseDTO> getOrder(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PAYMENT_SERVICE_URL + "/pay/get/" + id, ResponseResult.class, id);
    }
}
