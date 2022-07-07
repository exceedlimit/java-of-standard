package com.example.standardofjava.chapter7.model;

import com.example.standardofjava.Common;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ParentClass {

    private String testMember1 = "Parent testMember1";
    private String testMember2 = "Parent testMember2";

    public String testMemberToString(){
        return "testMember1 : " + testMember1 + " / testMember2 : " + testMember2;
    }

}
