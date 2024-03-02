package jp.tokyo.leon.cloud.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jp.tokyo.leon.cloud.entity.Pay;
import jp.tokyo.leon.cloud.entity.PayDTO;
import jp.tokyo.leon.cloud.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author leon
 * @date 2024/3/2 14:26
 */
@RestController
@Slf4j
@Tag(name = "支付微服务模块", description = "支付CRUD")
public class PayController {

    @Resource
    private PayService payService;

    @PostMapping("/pay/add")
    @Operation(summary = "新增", description = "新增支付流水方法")
    public String addPay(@RequestBody Pay pay) {
        log.info("pay:{}", pay);
        int add = payService.add(pay);
        return "成功插入记录，返回值" + add;
    }

    @DeleteMapping("/pay/delete/{id}")
    @Operation(summary = "删除", description = "删除支付流水方法")
    public Integer deletePay(@PathVariable("id") Integer id) {
        return payService.delete(id);
    }

    @PutMapping("/pay/update")
    @Operation(summary = "更新", description = "更新支付流水方法")
    public String updatePay(@RequestBody PayDTO payDTO) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);

        int update = payService.update(pay);
        return "成功 修改记录，返回值" + update;
    }

    @GetMapping("/pay/get/{id}")
    @Operation(summary = "获取", description = "获取支付流水方法")
    public Pay getById(@PathVariable("id") Integer id) {
        return payService.getById(id);
    }

    @GetMapping("/pay/get-all")
    @Operation(summary = "获取全部", description = "获取全部支付流水方法")
    public List<Pay> getAll() {
        return payService.getAll();
    }
}
