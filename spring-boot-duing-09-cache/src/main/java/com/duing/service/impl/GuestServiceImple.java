package com.duing.service.impl;

import com.duing.bean.Guest;
import com.duing.mapper.GuestMapper;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames = "guests")
@Service
public class GuestServiceImple implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> list() {
        return mapper.list();
    }
    @Cacheable(/*cacheNames = "guests",*/key = "#id",/*unless = "#id>1",*/condition = "#id>1")
    @Override
    public Guest selectGuestById(int id) {

        System.out.println("查询第"+id+"位嘉宾信息");
        return mapper.selectGuestById(id);
    }

    @CachePut(/*cacheNames = "guests",*/ key = "#guest.id")
    @Override
    public Guest updateGuest(Guest guest) {
        System.out.println("更新第"+guest.getId()+"位嘉宾的信息");
        mapper.updateGuest(guest);
        return guest;
    }

    @CacheEvict(/*cacheNames = "guests",*/  key = "#id")
    @Override
    public int deleteGuest(int id) {
        System.out.println("删除第"+id+"位嘉宾的信息");
        return mapper.deleteGuest(id);
    }

    /**
     * beforeInvocation：在方法之前执行缓存
     * @return
     */
    @CacheEvict(/*cacheNames = "guests",*/ allEntries = true,beforeInvocation = true)
//    @Caching(put={},cacheable = {},evict = {})
    @Override
    public int deleteAllGuest() {
        System.out.println("删除所有嘉宾的信息");

        int result = mapper.deleteAllGuest();
        int a = 7/0;
        return result;

    }
}
