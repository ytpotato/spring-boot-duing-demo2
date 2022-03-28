package com.duing.controller;

import com.duing.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


/**
 * @Api(tags = "嘉宾相关接口",description = "提供给嘉宾相关的REST API") 对接口做描述
 * 控制类 处理请求响应
 */
@RestController
@RequestMapping("/guest")
@Api(tags = "嘉宾相关接口",description = "提供给嘉宾相关的REST API")
public class GuestController {
    /**
     * guest（嘉宾）列表
     * @ApiOperation 描述接口作用信息
     * @return
     */
    @GetMapping
    @ApiOperation("查询所有嘉宾信息")
    public String list(Model model){
        //调用service
        return  "guest list";
    }

    /**
     * @ApiIgnore 在文档中不显示此接口
     * @return
     */
    @GetMapping("/toAdd")
    @ApiIgnore
    public String toAdd(){
        return "toadd guest";
    }
    @ApiOperation("新增嘉宾")
    @PostMapping("/add")
    public String add(Guest guest){
        //调用service
        return "add guest";
    }

    /**
     *  @ApiImplicitParam 对接口方法参数做描述
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    @ApiIgnore
    @ApiImplicitParam(name = "name",value = "姓名")
    public String toUpdate(@PathVariable("name") String name){
        //调用service方法
        return "toUpdate";
    }

    @PutMapping("/update")
    @ApiOperation("修改嘉宾信息")
    public String update(Guest guest){
        return "update  guest";
    }

    @DeleteMapping("/delete/{name}")
    @ApiOperation("删除嘉宾信息")
    @ApiImplicitParam(name = "name",value = "姓名")
    public String delete(@PathVariable("name") String name){
        return "delete  guest";
    }
}
