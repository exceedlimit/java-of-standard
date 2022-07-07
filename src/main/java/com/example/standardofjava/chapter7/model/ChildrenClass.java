package com.example.standardofjava.chapter7.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ChildrenClass extends ParentClass{

    private String testMember1 = "Children testMember1";
    private String testMember2 = "Children testMember2";
    private String childrenTest = "test Children";

    public void setParentTestMember1(String str){
        super.setTestMember1(str);
    }
    public void setParentTestMember2(String str){
        super.setTestMember2(str);
    }

    public String defaultTestMemberToString(){
        return "testMember1 : " + testMember1 + " / testMember2 : " + testMember2;
    }

    public String childTestMemberToString(){
        return "testMember1 : " + this.testMember1 + " / testMember2 : " + this.testMember2;
    }
    @Override
    public String testMemberToString(){
        return "변경되었습니다";
    }
}
