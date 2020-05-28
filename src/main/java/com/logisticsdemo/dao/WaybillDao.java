package com.logisticsdemo.dao;

import com.logisticsdemo.bean.SWaybill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/3/27.
 */
@Repository
@Transactional
public interface WaybillDao {
    List<Map> selAllWaybill();

    Integer selWaybillCount();

    void addWaybill(SWaybill sWaybill);

    void someDel(int[] ids);

    void delWaybill(int cId);

    SWaybill getWaybill(int cId);

    void editWaybill(SWaybill sWaybill);

    List<Map> getDriver();

    List<Map> getCarId();

    List<SWaybill> orderTask();
}
