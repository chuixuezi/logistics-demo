package com.logisticsdemo.service.impl;

import com.logisticsdemo.bean.SFinance;
import com.logisticsdemo.dao.FinanceDao;
import com.logisticsdemo.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class FinanceServiceImpl implements FinanceService {
    @Autowired
    private FinanceDao financeDao;

    @Override
    public List<Map> selAllFinance() {
        return financeDao.selAllFinance();
    }

    @Override
    public Integer selFinanceCount() {
        return financeDao.selFinanceCount();
    }

    @Override
    public void addFinance(SFinance sFinance) {
        financeDao.addFinance(sFinance);
    }

    @Override
    public void someDel(int[] ids) {
        financeDao.someDel(ids);
    }

    @Override
    public void delFinance(int fId) {
        financeDao.delFinance(fId);
    }

    @Override
    public SFinance getFinance(int fId) {
        return financeDao.getFinance(fId);
    }

    @Override
    public void editFinance(SFinance sFinance) {
        financeDao.editFinance(sFinance);
    }

    @Override
    public List<Map<String,Integer>> selExpend() {
        return financeDao.selExpend();
    }
}
