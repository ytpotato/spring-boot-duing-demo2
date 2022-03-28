package com.duing.controller;

import com.duing.bean.Guest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GuestController {
    @GetMapping("/guest1")
    public String guest1(@Valid Guest guest){

        return "Success";
    }
    @GetMapping("/guest")
    public String guest(@Valid Guest guest, BindingResult result){
        if (result.getErrorCount()>0){
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer buffer = new StringBuffer();
            for (FieldError fieldError : fieldErrorList){
                buffer.append(fieldError.getField());
                buffer.append("\t");
                buffer.append(fieldError.getDefaultMessage());
                buffer.append("\n");
            }
            return buffer.toString();
        }
        return "Success";
    }
}
