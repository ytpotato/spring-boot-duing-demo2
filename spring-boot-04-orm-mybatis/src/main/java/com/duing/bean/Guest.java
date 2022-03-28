package com.duing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类  代表嘉宾
 */
@Data @AllArgsConstructor@NoArgsConstructor
public class Guest {

    private Long id;
    private String name;
    private String role;
}
