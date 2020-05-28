package com.logisticsdemo.common;

import com.logisticsdemo.bean.SWaybill;
import com.logisticsdemo.service.WaybillService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class WaybillDate {
    @Resource
    private WaybillService waybillService;

    public void check() {
        List<SWaybill> sWaybills = waybillService.orderTask();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date now = new Date();

        for (SWaybill sWaybill : sWaybills) {
            Date temp = null;
            try {
                temp = sdf.parse(sWaybill.getwOrder_time());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long days = (now.getTime() - temp.getTime() + 1000000) / (60 * 60 * 24 * 1000);

            if(days>=1){
                waybillService.delWaybill(sWaybill.getwId());
                System.out.println("一条订单过期 正在删除.....");
            }
//            System.out.println("temp 与 now 相隔 " + days + " 天");
        }


    }

}
