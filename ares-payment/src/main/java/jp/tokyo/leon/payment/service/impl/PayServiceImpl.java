package jp.tokyo.leon.payment.service.impl;

import jakarta.annotation.Resource;
import jp.tokyo.leon.api.dto.request.PayRequestDTO;
import jp.tokyo.leon.api.dto.response.PayResponseDTO;
import jp.tokyo.leon.dao.entity.Pay;
import jp.tokyo.leon.dao.mapper.PayMapper;
import jp.tokyo.leon.payment.service.PayService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon
 * @date 2024/3/2 14:22
 */
@Service
public class PayServiceImpl implements PayService {

    private final ModelMapper modelMapper = new ModelMapper();

    @Resource
    private PayMapper payMapper;
    @Override
    public int add(PayRequestDTO payRequestDTO) {
        Pay pay = modelMapper.map(payRequestDTO, Pay.class);
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(PayRequestDTO payRequestDTO) {
        Pay pay = modelMapper.map(payRequestDTO, Pay.class);
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PayResponseDTO> getAll() {
        return payMapper.selectAll().stream().map(pay -> modelMapper.map(pay, PayResponseDTO.class)).collect(Collectors.toList());
    }
}
