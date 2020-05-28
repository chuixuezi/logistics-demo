package com.logisticsdemo.service;

import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.bean.Scar;

import java.util.List;
import java.util.Map;

public interface CarService {
    List<Map> selAllCar();

    Integer selCarCount();

    void addCar(Scar Scar);

    void someDel(int[] ids);

    void delCar(int cId);

    Scar getCar(int cId);

    void editCar(Scar Scar);
}
