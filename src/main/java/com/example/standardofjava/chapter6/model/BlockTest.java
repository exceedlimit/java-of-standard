package com.example.standardofjava.chapter6.model;

import com.example.standardofjava.Common;

public class BlockTest {
    static int count =0;
    int serialNo;
    static{
        //클래스를 사용할 때 최초 1회만 호출됨
        Common.println("클래스 초기화 블럭");
    }
    {
        Common.println("인스턴스 초기화 블럭");
        ++count;
        serialNo = count;
    }
    public BlockTest(){
        Common.println("생성자");
    }
}
