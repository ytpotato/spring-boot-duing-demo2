package com.duing.service;

import com.duing.bean.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();

    Guest selectGuestById(int id);

    Guest updateGuest(Guest guest);

    int deleteGuest(int id);

    int deleteAllGuest();
}
