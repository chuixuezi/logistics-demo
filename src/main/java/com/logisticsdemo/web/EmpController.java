package com.logisticsdemo.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.common.CommonUtils;
import com.logisticsdemo.common.Contants;
import com.logisticsdemo.dao.EmpDao;
import com.logisticsdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@MultipartConfig
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @Resource
    private CommonUtils cu;

    @RequestMapping("/addEmp")
    public String addEmp(SEmp sEmp, MultipartFile faceUpload) {

//        System.out.println("sEmp = " + sEmp);

//        System.out.println("faceUpload = " + faceUpload.isEmpty());
        //拼接新文件名
        String newFileName = cu.fileUpload(faceUpload, Contants.EMP_FACE_PATH);

        //保存图片名称到数据库
        sEmp.setsFace("/emp_face/"+newFileName);//需要使用本地文件所使用的斜杆   \\

        empService.addEmp(sEmp);
        return "index";
        //如果在使用动态页面时还想跳转到/static/index.html
        //  可以使用重定向return "redirect:/index.html"。
    }

    @RequestMapping("/someDel")
    public String someDel(String ids) {
        String[] strings = ids.split(",");
        int[] id = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
//            System.out.println(split[i]+"-");
            id[i] = Integer.parseInt(strings[i]);
//            System.out.println(i);
        }
//        System.out.println(id.length);
        empService.someDel(id);
        return "index";
    }

    @RequestMapping("/delEmp")
    public String delEmp(int sId) {
//        System.out.println("sId = " + sId);
        empService.delEmp(sId);
        return "index";
    }

    @RequestMapping("/editEmp")
    @ResponseBody
    public SEmp editEmp(int sId) {
//        System.out.println("sId = " + sId);
        SEmp sEmp = empService.getEmp(sId);
        return sEmp;
    }

    @RequestMapping("/editEmpTrue")
    public String editEmpTrue(SEmp sEmp, MultipartFile faceUpload) {

//        System.out.println("sEmp = " + sEmp);

//        System.out.println("faceUpload = " + faceUpload.isEmpty());
        if(!faceUpload.isEmpty()){
            //拼接新文件名
            String newFileName = cu.fileUpload(faceUpload, Contants.EMP_FACE_PATH);

            //保存图片名称到数据库
            sEmp.setsFace("/emp_face/"+newFileName);//需要使用本地文件所使用的斜杆   \\
        }

        empService.editEmp(sEmp);
        return "redirect:/page/emp.html";
        //如果在使用动态页面时还想跳转到/static/index.html
        //  可以使用重定向return "redirect:/index.html"。
    }

    @RequestMapping("/login")
    public String login(HttpSession session,SEmp sEmp){
        sEmp=empService.login(sEmp);
//        System.out.println("sEmp = " + sEmp);
        session.setAttribute("sEmp",sEmp);
//        System.out.println("登陆成功");
        return "redirect:../index";
    }

    @RequestMapping("/login_out")
    public String login_out(HttpSession session){
        session.removeAttribute("sEmp");
        return "redirect:../index";
    }
}
