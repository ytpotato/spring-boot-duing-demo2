package com.duing.service.impl;

import com.duing.bean.Guest;
import com.duing.mapper.GuestMapper;
import com.duing.mapper2.GuestMapper2;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层 做逻辑处理
 */
@Service
public class GuestServiceImpl implements GuestService {


    /*@Autowired
    private com.duing.tk.mapper.GuestMapper mapper;*/
    @Autowired
    private GuestMapper mapper;

    @Autowired
    private GuestMapper2 mapper2;


    public List<Guest> list() {
        //调用dao
        return mapper2.getAll();
    }

}
