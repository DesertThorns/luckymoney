package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Program: luckymoney
 * @ClassName: LuckymoneyService
 * @Description: TODD
 * @Author: Administrator
 * @Date: 2020/9/18
 **/
@Service
public class LuckymoneyService {
    @Autowired
    private LuckymoneyRepository repository;

    /**
     * 事务，指数据库的事务，要么都执行，要么都不执行
     * 例如：扣库存 > 创建订单
     */
    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("刘成虎");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);
        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("刘成虎");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);

    }
}
