package com.example.standardofjava.chapter7.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Singleton {
    private static Singleton singleton = new Singleton();

    private int test1;

    private Singleton(){
        test1 = 1;
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
