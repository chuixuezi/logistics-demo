package com.logisticsdemo.service.impl;

import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.bean.Scar;
import com.logisticsdemo.dao.CarDao;
import com.logisticsdemo.dao.EmpDao;
import com.logisticsdemo.service.CarService;
import com.logisticsdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;


    @Override
    public List<Map> selAllCar() {
        return carDao.selAllCar();
    }

    @Override
    public Integer selCarCount() {
        return carDao.selCarCount();
    }

    @Override
    public void addCar(Scar scar) {
        carDao.addCar(scar);
    }

    @Override
    public void someDel(int[] ids) {
        carDao.someDel(ids);
    }

    @Override
    public void delCar(int cId) {
        carDao.delCar(cId);
    }

    @Override
    public Scar getCar(int cId) {
        Scar scar = carDao.getCar(cId);
        return scar;
    }

    @Override
    public void editCar(Scar scar) {
        carDao.editCar(scar);
    }
}
