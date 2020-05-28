package com.logisticsdemo.web;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.service.CarService;
import com.logisticsdemo.service.EmpService;
import com.logisticsdemo.service.FinanceService;
import com.logisticsdemo.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {
    @Autowired
    EmpService empService;
    @Autowired
    CarService carService;
    @Autowired
    WaybillService waybillService;
    @Autowired
    FinanceService financeService;

    @RequestMapping("/allEmp")
    public String allEmp() {
        String json = JSON.toJSONString(empService.selAllEmp());
        Integer count = empService.selEmpCount();
        json = toJson(json, count);
//        System.out.println("json = " + json);
        return json;
    }

    @RequestMapping("/allCar")
    public String allCar() {
        String json = JSON.toJSONString(carService.selAllCar());
        Integer count = carService.selCarCount();
        json = toJson(json, count);
//        System.out.println("json = " + json);
        return json;
    }

    @RequestMapping("/allWaybill")
    public String allWaybill() {
        String json = JSON.toJSONString(waybillService.selAllWaybill());
        Integer count = waybillService.selWaybillCount();
        json = toJson(json, count);
//        System.out.println("json = " + json);
        return json;
    }

    @RequestMapping("/allFinance")
    public String allFinance() {
        String json = JSON.toJSONString(financeService.selAllFinance());
        Integer count = financeService.selFinanceCount();
        json = toJson(json, count);
//        System.out.println("json = " + json);
        return json;
    }

    private String toJson(String str, Integer count) {
        str = "{\n" +
                "  \"code\": 0,\n" +
                "  \"msg\": \"\",\n" +
                "  \"count\": " + count + ",\n" +
                "  \"data\": " + str + "\n" +
                "}";
        return str;
    }
}
