package com.logisticsdemo.service;

import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.bean.SFinance;

import java.util.List;
import java.util.Map;

public interface FinanceService {
    List<Map> selAllFinance();

    Integer selFinanceCount();

    void addFinance(SFinance sFinance);

    void someDel(int[] ids);

    void delFinance(int fId);

    SFinance getFinance(int fId);

    void editFinance(SFinance sFinance);

    List<Map<String,Integer>> selExpend();
}
