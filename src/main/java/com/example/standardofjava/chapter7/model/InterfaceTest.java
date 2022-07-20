package com.example.standardofjava.chapter7.model;

import com.example.standardofjava.Common;

public interface InterfaceTest {
    static void test(){
        Common.println(1);
    }
    default String testMemberToString(){
        String a ="1";
        return a;
    };
}
