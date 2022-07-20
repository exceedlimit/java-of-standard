package com.example.standardofjava.chapter6.model;

import com.example.standardofjava.Common;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class VariableTest {
    private int instanceValue = 1;
    public static int classValue = 2;//private로는 셋팅안된다.

    public void method(){
        int localValue = 3;
        Common.println("localValue: " + localValue);
    }

    public void setClassValue(int var){
        classValue=var;
    }

}
