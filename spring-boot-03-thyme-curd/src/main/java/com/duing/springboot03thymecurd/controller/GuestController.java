package com.duing.springboot03thymecurd.controller;

import com.duing.springboot03thymecurd.bean.Guest;
import com.duing.springboot03thymecurd.service.GuestService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 控制类 处理请求响应
 */
@Controller
public class GuestController {
    @Autowired
    private GuestService service;
    /**
     * guest（嘉宾）列表
     * @return
     */
    @RequestMapping("/guest/list")
    public String list(Model model){
        //调用service
        List<Guest> guestList = service.list();
        model.addAttribute("guestList",guestList);
        return  "list";
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        //调用service
        service.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toUpdate")
    public String toUpdate(Model model,String name){
        //调用service方法
        Guest oldGuest = service.get(name);
        model.addAttribute("guest",oldGuest);
        return "update";
    }

    @RequestMapping("/guest/update")
    public String update(Guest guest){
        //调用service
        service.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delete(String name){
        service.delete(name);
        return "redirect:/guest/list";
    }
}
