package jp.tokyo.leon.payment.service;

import jp.tokyo.leon.api.dto.request.PayRequestDTO;
import jp.tokyo.leon.api.dto.response.PayResponseDTO;
import jp.tokyo.leon.dao.entity.Pay;

import java.util.List;

/**
 * @author leon
 * @date 2024/3/2 14:20
 */
public interface PayService {

    int add(PayRequestDTO pay);

    int delete(Integer id);

    int update(PayRequestDTO pay);

    Pay getById(Integer id);

    List<PayResponseDTO> getAll();
}
