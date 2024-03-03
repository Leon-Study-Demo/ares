package jp.tokyo.leon.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2024/3/3 12:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayRequestDTO {

    private Integer id;
    //支付流水号
    private String payNo;
    //订单流水号
    private String orderNo;
    //用户账号ID
    private Integer userId;
    //交易金额
    private BigDecimal amount;
}
