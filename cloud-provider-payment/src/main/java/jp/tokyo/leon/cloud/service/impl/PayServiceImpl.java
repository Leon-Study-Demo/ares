package jp.tokyo.leon.cloud.service.impl;

import jakarta.annotation.Resource;
import jp.tokyo.leon.cloud.entity.Pay;
import jp.tokyo.leon.cloud.mapper.PayMapper;
import jp.tokyo.leon.cloud.service.PayService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leon
 * @date 2024/3/2 14:22
 */
@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PayMapper payMapper;
    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
