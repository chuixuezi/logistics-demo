package com.logisticsdemo.dao;

import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.bean.Scar;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/3/27.
 */
@Repository
@Transactional
public interface CarDao {
    List<Map> selAllCar();

    Integer selCarCount();

    void addCar(Scar Scar);

    void someDel(int[] ids);

    void delCar(int cId);

    Scar getCar(int cId);

    void editCar(Scar Scar);
}
