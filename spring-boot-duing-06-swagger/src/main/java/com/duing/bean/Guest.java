package com.duing.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类  代表嘉宾
 */
@Data @AllArgsConstructor
@ApiModel("嘉宾")
public class Guest {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("角色")
    private String role;
}
