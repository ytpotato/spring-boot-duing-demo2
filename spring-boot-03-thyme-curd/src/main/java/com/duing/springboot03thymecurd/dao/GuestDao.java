package com.duing.springboot03thymecurd.dao;

import com.duing.springboot03thymecurd.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据层  数据的读写
 */
@Repository
public class GuestDao {
    static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("黄晓明","boss"));
        guestList.add(new Guest("秦海璐","总经理"));
        guestList.add(new Guest("林述巍","厨师长"));
        guestList.add(new Guest("王俊凯","财务"));
        guestList.add(new Guest("杨紫","前台"));
    }

    /**
     * 餐厅员工列表
     * @return 所有员工 list
     */
    public List<Guest> list(){
        return guestList;
    }

    public void add(Guest guest){
        guestList.add(guest);
    }

    public Guest get(String name){
        for (Guest guest : guestList){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }

    public void update(Guest newGuest){
        Guest oldGest = get(newGuest.getName());
        oldGest.setRole(newGuest.getRole());
    }

    public void delete(String name){
        guestList.remove(get(name));
    }
}
