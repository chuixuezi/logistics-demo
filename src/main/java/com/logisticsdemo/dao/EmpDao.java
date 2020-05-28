package com.logisticsdemo.dao;

import com.logisticsdemo.bean.SEmp;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/3/27.
 */
@Repository
@Transactional
public interface EmpDao {
    List<Map> selAllEmp();

    Integer selEmpCount();

    void addEmp(SEmp sEmp);

    void someDel(int[] ids);

    void delEmp(int sId);

    SEmp getEmp(int sId);

    void editEmp(SEmp sEmp);

    SEmp login(SEmp sEmp);
}
