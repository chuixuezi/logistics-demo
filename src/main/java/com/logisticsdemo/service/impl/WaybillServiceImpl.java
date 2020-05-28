package com.logisticsdemo.service.impl;

import com.logisticsdemo.bean.SWaybill;
import com.logisticsdemo.dao.WaybillDao;
import com.logisticsdemo.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WaybillServiceImpl implements WaybillService {

    @Autowired
    WaybillDao waybillDao;


    @Override
    public List<Map> selAllWaybill() {
        return waybillDao.selAllWaybill();
    }

    @Override
    public Integer selWaybillCount() {
        return waybillDao.selWaybillCount();
    }

    @Override
    public void addWaybill(SWaybill sWaybill) {
        waybillDao.addWaybill(sWaybill);
    }

    @Override
    public void someDel(int[] ids) {
        waybillDao.someDel(ids);
    }

    @Override
    public void delWaybill(int wId) {
        waybillDao.delWaybill(wId);
    }

    @Override
    public SWaybill getWaybill(int wId) {
        SWaybill sWaybill = waybillDao.getWaybill(wId);
        return sWaybill;
    }

    @Override
    public void editWaybill(SWaybill sWaybill) {
        waybillDao.editWaybill(sWaybill);
    }

    @Override
    public List<Map> getDriver() {
        List<Map> driver = waybillDao.getDriver();
        return driver;
    }

    @Override
    public List<Map> getCarId() {
        List<Map> carId = waybillDao.getCarId();
        return carId;
    }

    @Override
    public List<SWaybill> orderTask() {
        return waybillDao.orderTask();
    }
}
