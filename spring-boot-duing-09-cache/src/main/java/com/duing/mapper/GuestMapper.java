package com.duing.mapper;

import com.duing.bean.Guest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GuestMapper {

    @Select("select id,name,role from guest")
    List<Guest> list();

    @Select("select id,name,role from guest where id = #{id}")
    Guest selectGuestById(int id);

    @Update("update guest set name=#{name},role=#{role} where id=#{id}")
    int updateGuest(Guest guest);

    @Delete("delete from guest where id=#{id}")
    int deleteGuest(int id);

    @Delete("delete from guest")
    int deleteAllGuest();
}
