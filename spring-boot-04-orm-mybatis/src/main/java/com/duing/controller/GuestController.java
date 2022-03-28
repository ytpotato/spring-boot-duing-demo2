package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * 控制类 处理请求响应
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService service;
    /**
     * guest（嘉宾）列表
     * @return
     */
    @GetMapping("")
    public String list(Model model){
        //调用service
        List<Guest> guestList = service.list();

        model.addAttribute("guestList",guestList);
        return  "list";
    }


}
