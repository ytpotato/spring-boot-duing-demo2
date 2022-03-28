package com.duing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duing.bean.Guest;
import com.duing.mapper.GuestMapper;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层 做逻辑处理
 */
@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements  GuestService {


}
