package com.duing.service.impl;

import com.duing.bean.Guest;
import com.duing.repostory.GuestRepostory;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层 做逻辑处理
 */
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepostory repostory;

    public List<Guest> list() {
        //调用dao
        return repostory.findAll();
    }

}
