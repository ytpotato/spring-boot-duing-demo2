package com.duing.mapper;

import com.duing.bean.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper {
    @Select("select name,role from guest")
    List<Guest> getAll();
}
