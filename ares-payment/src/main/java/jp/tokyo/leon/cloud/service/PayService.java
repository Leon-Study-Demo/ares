package jp.tokyo.leon.cloud.service;

import jp.tokyo.leon.cloud.entity.Pay;

import java.util.List;

/**
 * @author leon
 * @date 2024/3/2 14:20
 */
public interface PayService {

    int add(Pay pay);

    int delete(Integer id);

    int update(Pay pay);

    Pay getById(Integer id);

    List<Pay> getAll();
}
