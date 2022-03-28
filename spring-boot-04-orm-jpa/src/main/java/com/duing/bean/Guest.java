package com.duing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 实体类  代表嘉宾
 */
@Entity
@Data @AllArgsConstructor@NoArgsConstructor
public class Guest {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}
