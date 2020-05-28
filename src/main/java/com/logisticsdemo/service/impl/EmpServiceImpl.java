package com.logisticsdemo.service.impl;

import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.dao.EmpDao;
import com.logisticsdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpDao empDao;


    @Override
    public List<Map> selAllEmp() {
        return empDao.selAllEmp();
    }

    @Override
    public Integer selEmpCount() {
        return empDao.selEmpCount();
    }

    @Override
    public void addEmp(SEmp sEmp) {
        empDao.addEmp(sEmp);
    }

    @Override
    public void someDel(int[] ids) {
        empDao.someDel(ids);
    }

    @Override
    public void delEmp(int sId) {
        empDao.delEmp(sId);
    }

    @Override
    public SEmp getEmp(int sId) {
        SEmp sEmp = empDao.getEmp(sId);
        return sEmp;
    }

    @Override
    public void editEmp(SEmp sEmp) {
        empDao.editEmp(sEmp);
    }

    @Override
    public SEmp login(SEmp sEmp) {
        return empDao.login(sEmp);
    }
}
