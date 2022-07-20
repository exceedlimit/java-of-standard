package com.example.standardofjava.chapter6.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class 생성자Class {

    private String a;
    private long b;

    public 생성자Class(String a) {
          this.a=a; b=2;
    }
    public 생성자Class(long b) {
        this("a");
        this.b=b;
    }
    public 생성자Class(String a, long b) {
        this.a=a;
        this.b=b;
    }

    public 생성자Class(생성자Class b) {
        this(b.getA(), b.getB());
    }
}
