package com.logisticsdemo.web;

import com.logisticsdemo.bean.SWaybill;
import com.logisticsdemo.common.CommonUtils;
import com.logisticsdemo.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;
import java.util.*;

@Controller
@MultipartConfig
@RequestMapping("/waybill")
public class WaybillController {

    @Autowired
    WaybillService waybillService;

    @Resource
    private CommonUtils cu;

    private static final List<String> state=new ArrayList<String>(Arrays.asList
            ("已下单","已支付","已装货","已到达","已卸货","已返回"));

    @RequestMapping("/getOption")
    @ResponseBody
    public Map addWaybill(Integer wId) {
        List<Map> driver = waybillService.getDriver();
        List<Map> carId = waybillService.getCarId();
        HashMap hashMap = new HashMap();
        if (wId != null) {
            System.out.println("wId不为空 = " + wId);
            SWaybill waybill = waybillService.getWaybill(wId);
            hashMap.put("waybill",waybill);
        }else {
            System.out.println("wId为空 = " + wId);
        }
        hashMap.put("driver", driver);
        hashMap.put("carId", carId);
        hashMap.put("wState", getState());
        return hashMap;
    }

    @RequestMapping("/addWaybillTrue")
    public String addWaybillTrue(SWaybill sWaybill) {


        waybillService.addWaybill(sWaybill);
        return "redirect:/page/waybill.html";
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
        waybillService.someDel(id);
        return "index";
    }

    @RequestMapping("/delWaybill")
    public String delWaybill(int wId) {
        waybillService.delWaybill(wId);
        return "index";
    }

    @RequestMapping("/editWaybill")
    @ResponseBody
    public SWaybill editWaybill(int wId, Model model) {
//        System.out.println("wId = " + wId);
        SWaybill sWaybill = waybillService.getWaybill(wId);
        return sWaybill;
    }

    @RequestMapping("/editWaybillTrue")
    public String editWaybillTrue(SWaybill sWaybill) {

//        System.out.println("sWaybill = " + sWaybill);
        waybillService.editWaybill(sWaybill);
        return "redirect:/page/waybill.html";
        //如果在使用动态页面时还想跳转到/static/index.html
        //  可以使用重定向return "redirect:/index.html"。
    }

    public List<Map> getState() {
        List<Map> list = new ArrayList();
        for (String s : state) {
            HashMap hashMap = new HashMap();
            hashMap.put("state",s);
            list.add(hashMap);
        }
        return list;
    }
}
