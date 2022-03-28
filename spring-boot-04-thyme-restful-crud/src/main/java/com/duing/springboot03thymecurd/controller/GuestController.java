package com.duing.springboot03thymecurd.controller;

import com.duing.springboot03thymecurd.bean.Guest;
import com.duing.springboot03thymecurd.service.GuestService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public String list(Model model){
        //调用service
        List<Guest> guestList = service.list();
        model.addAttribute("guestList",guestList);
        return  "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping("/add")
    public String add(Guest guest){
        //调用service
        service.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        //调用service方法
        Guest oldGuest = service.get(name);
        model.addAttribute("guest",oldGuest);
        return "update";
    }

    @PutMapping("/update")
    public String update(Guest guest){
        //调用service
        service.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/delete/{name}")
    public String delete(@PathVariable("name") String name){
        service.delete(name);
        return "redirect:/guest";
    }
}
