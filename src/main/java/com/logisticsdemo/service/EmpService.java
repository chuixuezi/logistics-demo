package com.logisticsdemo.service;

import com.logisticsdemo.bean.SEmp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface EmpService {
    List<Map> selAllEmp();

    Integer selEmpCount();

    void addEmp(SEmp sEmp);

    void someDel(int[] ids);

    void delEmp(int sId);

    SEmp getEmp(int sId);

    void editEmp(SEmp sEmp);

    SEmp login(SEmp sEmp);
}
