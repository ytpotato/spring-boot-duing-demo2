package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;

    @GetMapping("")
    public List<Guest> list(){
        return service.list();
    }

    @RequestMapping("/{id}")
    public Guest guest(@PathVariable(name = "id") int id){
        return service.selectGuestById(id);
    }

    @GetMapping("/update")
    public Guest updateGuest(Guest guest) {
        Guest guest1 = service.updateGuest(guest);
        return guest1;
    }

    @GetMapping("/delete/{id}")
    public int deleteGuest(@PathVariable(name="id") int id) {
        return service.deleteGuest(id);
    }

    @GetMapping("/deleteAll")
    public String deleteAllGuest() {
        service.deleteAllGuest();
        return "Sueecss";
    }

}
