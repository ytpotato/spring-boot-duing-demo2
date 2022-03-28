package com.duing.repostory;

import com.duing.bean.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepostory extends JpaRepository<Guest,Long> {
}
