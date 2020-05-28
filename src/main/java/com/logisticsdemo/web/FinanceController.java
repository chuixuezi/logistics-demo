package com.logisticsdemo.web;

import com.logisticsdemo.bean.SFinance;
import com.logisticsdemo.bean.SWaybill;
import com.logisticsdemo.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.MultipartConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@MultipartConfig
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    FinanceService financeService;

    @RequestMapping("/addFinanceTrue")
    public String addWaybillTrue(SFinance sFinance) {


        financeService.addFinance(sFinance);
        return "redirect:/page/finance.html";
        //如果在使用动态页面时还想跳转到/static/index.html
        //  可以使用重定向return "redirect:/index.html"。
    }

    @RequestMapping("/someDel")
    public String someDel(String ids) {
        String[] strs = ids.split(",");
        int[] id = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
//            System.out.println(split[i]+"-");
            id[i] = Integer.parseInt(strs[i]);
//            System.out.println(i);
        }
//        System.out.println(id.length);
        financeService.someDel(id);
        return "index";
    }

    @RequestMapping("/delFinance")
    public String delWaybill(int fId) {
        financeService.delFinance(fId);
        return "index";
    }

    @RequestMapping("/editFinance")
    @ResponseBody
    public SFinance editWaybill(int fId) {
//        System.out.println("wId = " + wId);
        SFinance sFinance = financeService.getFinance(fId);
        return sFinance;
    }

    @RequestMapping("/editFinanceTrue")
    public String editWaybillTrue(SFinance sFinance) {

//        System.out.println("sWaybill = " + sWaybill);
        financeService.editFinance(sFinance);
        return "redirect:/page/finance.html";
        //如果在使用动态页面时还想跳转到/static/index.html
        //  可以使用重定向return "redirect:/index.html"。
    }

    @RequestMapping("/getExpendData")
    @ResponseBody
    public List getExpendData() {
        List<Map<String, Integer>> list = financeService.selExpend();
        List data = new ArrayList();
//        System.out.println("list.get = " + list.get(0).get("fDate"));
        for (int index = 0; index < 12; index++) {
            Map<String, Integer> map = null;
            try {
                map = list.get(index);
            } catch (Exception e) {
                map = new HashMap();
            }
            if (map.isEmpty()) {
                data.add(0);
            } else {
                data.add(map.get("expend"));
            }
        }
        Map hashMap = new HashMap();
        hashMap.put("expendData", data);
//        System.out.println("hashMap = " + hashMap.toString());
        return data;
    }

}
