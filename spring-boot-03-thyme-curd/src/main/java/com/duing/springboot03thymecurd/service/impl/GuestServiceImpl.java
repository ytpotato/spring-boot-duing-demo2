package com.duing.springboot03thymecurd.service.impl;

import com.duing.springboot03thymecurd.bean.Guest;
import com.duing.springboot03thymecurd.dao.GuestDao;
import com.duing.springboot03thymecurd.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层 做逻辑处理
 */
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao dao;
    @Override
    public List<Guest> list() {
        //调用dao
        return dao.list();
    }

    @Override
    public void add(Guest guest) {
        //调用dao
        dao.add(guest);
    }

    @Override
    public Guest get(String name) {
        //调用dao
        return dao.get(name);
    }

    @Override
    public void update(Guest guest) {
        //调用dao
        dao.update(guest);
    }

    public void delete(String name){
        dao.delete(name);
    }
}
