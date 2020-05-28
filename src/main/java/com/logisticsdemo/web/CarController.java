package com.logisticsdemo.web;

import com.logisticsdemo.bean.SEmp;
import com.logisticsdemo.bean.Scar;
import com.logisticsdemo.common.CommonUtils;
import com.logisticsdemo.common.Contants;
import com.logisticsdemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;

@Controller
@MultipartConfig
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @Resource
    private CommonUtils cu;

    @RequestMapping("/addCar")
    public String addEmp(Scar scar, MultipartFile faceUpload) {

        System.out.println("scar = " + scar);

        System.out.println("faceUpload = " + faceUpload.isEmpty());
        //拼接新文件名
        String newFileName = cu.fileUpload(faceUpload, Contants.CAR_IMG_PATH);

        //保存图片名称到数据库
        scar.setcImg("/car_img/" + newFileName);//需要使用本地文件所使用的斜杆   \\

        carService.addCar(scar);
        return "redirect:/page/emp.html";
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
        carService.someDel(id);
        return "index";
    }

    @RequestMapping("/delCar")
    public String delEmp(int cId) {
//        System.out.println("sId = " + sId);
        carService.delCar(cId);
        return "index";
    }

    @RequestMapping("/editCar")
    @ResponseBody
    public Scar editEmp(int cId) {
//        System.out.println("cId = " + cId);
        Scar scar = carService.getCar(cId);
        return scar;
    }

    @RequestMapping("/editCarTrue")
    public String editEmpTrue(Scar scar, MultipartFile faceUpload) {

//        System.out.println("sEmp = " + sEmp);

//        System.out.println("faceUpload = " + faceUpload.isEmpty());
        if (!faceUpload.isEmpty()) {
            //拼接新文件名
            String newFileName = cu.fileUpload(faceUpload, Contants.EMP_FACE_PATH);

            //保存图片名称到数据库
            scar.setcImg("/car_img/" + newFileName);//需要使用本地文件所使用的斜杆   \\
        }

        carService.editCar(scar);
        return "redirect:/page/car.html";
        //如果在使用动态页面时还想跳转到/static/index.html
        //  可以使用重定向return "redirect:/index.html"。
    }
}
