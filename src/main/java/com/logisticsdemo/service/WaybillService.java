package com.logisticsdemo.service;

import com.logisticsdemo.bean.SWaybill;
import com.logisticsdemo.bean.Scar;

import java.util.List;
import java.util.Map;

public interface WaybillService {
    List<Map> selAllWaybill();

    Integer selWaybillCount();

    void addWaybill(SWaybill sWaybill);

    void someDel(int[] ids);

    void delWaybill(int wId);

    SWaybill getWaybill(int wId);

    void editWaybill(SWaybill sWaybill);

    List<Map> getDriver();

    List<Map> getCarId();

    List<SWaybill> orderTask();
}
