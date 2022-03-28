package com.duing.test;

import com.duing.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValidTest {
    public static void main(String[] args){
        //普通模式
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        //快速失败模式
        Validator validatorFailFast = Validation.byDefaultProvider().configure().
                addProperty("hibernate.validator.fail_fast","true").
                buildValidatorFactory().getValidator();

        Guest guest = new Guest("","");
        Set<ConstraintViolation<Guest>> validate = validator.validate(guest);
        for (ConstraintViolation<Guest> violation : validate){
            System.out.println(violation.getPropertyPath()+","+violation.getMessage());
        }

        System.out.println("============================================");
        Set<ConstraintViolation<Guest>> violationFailFastSet = validatorFailFast.validate(guest);
        for (ConstraintViolation<Guest> violation : violationFailFastSet){
            System.out.println(violation.getPropertyPath()+","+violation.getMessage());
        }
    }

}
