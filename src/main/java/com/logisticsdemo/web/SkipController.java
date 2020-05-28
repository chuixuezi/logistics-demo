package com.logisticsdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

    //跳转到主页
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //跳转到员工管理
    @RequestMapping("/empEdit")
    public String empEdit(){
        return "page/empEdit";
    }
}
