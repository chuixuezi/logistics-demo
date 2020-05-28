package com.logisticsdemo.dao;

import com.logisticsdemo.bean.SFinance;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/3/27.
 */
@Repository
@Transactional
public interface FinanceDao {
    List<Map> selAllFinance();

    Integer selFinanceCount();

    void addFinance(SFinance sFinance);

    void someDel(int[] ids);

    void delFinance(int fId);

    SFinance getFinance(int fId);

    void editFinance(SFinance sFinance);

        List<Map<String,Integer>> selExpend();
}
