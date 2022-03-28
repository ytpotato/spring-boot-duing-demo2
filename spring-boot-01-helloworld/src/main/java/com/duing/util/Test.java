package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;


public class Test {
    public static void main(String[] args) {
        BasicTextEncryptor bs = new BasicTextEncryptor();
        bs.setPassword("123456!@#");
        String username = bs.encrypt("root");
        String password = bs.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
    }
}
