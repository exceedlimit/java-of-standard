package com.example.standardofjava.chapter6;

import com.example.standardofjava.Common;
import com.example.standardofjava.chapter6.model.BlockTest;
import com.example.standardofjava.chapter6.model.VariableTest;
import com.example.standardofjava.chapter6.model.생성자Class;
import org.springframework.stereotype.Service;

@Service
public class Chapter6Service {
    public void variablesTest(){
        VariableTest variableTest1 = new VariableTest();
        VariableTest variableTest2 = new VariableTest();
        variablesPrint(variableTest1,variableTest2);

        variableTest2.setClassValue(101);
        variableTest2.setInstanceValue(1001);
        variablesPrint(variableTest1,variableTest2);

        testReturn();
    }

    //메서드 선언 할 때에는 매개변수, 호출 할 때에는 인수(argument)
    public void variablesPrint(VariableTest variableTest1, VariableTest variableTest2){
        Common.println("test1 instanceValue : " + variableTest1.getInstanceValue());
        Common.println("test2 instanceValue : " + variableTest2.getInstanceValue());

        Common.println("test classValue : " + VariableTest.classValue);

        variableTest1.method();

    }

    //자동 형변환이 되면 Return 가능
    public Integer testReturn(){
        int a =0;
        return a;
    }

//    public static void staticMethodTest(){
//        // static 메서드 안에서 같은 클래스 내의 인스턴스 메서드 호출 불가.
//        testReturn();
//    }

    public void typeTest(){
        int i =0;
        Integer integer=0;
        String str="";

        typePrint(i,integer,str);
        changeValues(i,integer,str);
        typePrint(i,integer,str);

        Common.println("-------------------------------");

        TypeTest typeTest = new TypeTest();

        typePrint(typeTest.i,typeTest.integer,typeTest.str);
        changeValues(typeTest.i,typeTest.integer,typeTest.str);
        typePrint(typeTest.i,typeTest.integer,typeTest.str);
        changeValues(typeTest);
        typePrint(typeTest.i,typeTest.integer,typeTest.str);


    }
    class TypeTest{
        int i =0;
        Integer integer=0;
        String str="";
    }

    //이상하다..Integer랑 String은 referenceType아닌가? 왜 이거 변경 안되지?
    //찾아보니까 일단 String은 특별한 참조형 객체이다. 값을 변경할 때에 String은 새로운 String을 만들어서 그 주소를 String 변수에 재대입.
    //이렇다고 가정하고 생각해보면 str로 변수를 받아올 때에 해당 주소값을 changeValues 안에 있는 str에다만 대입하고 typeTest의 str에는 대입 x
    // Integer도 래퍼클래스로 equals로 할때 주소값이 아닌 값을 비교한다고 한다. 이와 같은 원리가 아닐까 생각..
    public void changeValues(int i, Integer integer, String str){
        i=100;
        integer=100;
        str="something";
    }
    public void changeValues(TypeTest typeTest){
        typeTest.i=100;
        typeTest.integer=100;
        typeTest.str="something";
    }

    public void typePrint(int i, Integer integer, String str){
        Common.println("i : " + i);
        Common.println("integer : " + integer);
        Common.println("str : " + str);
    }

    public String concatenate(String delim, String... args){
        StringBuffer result = new StringBuffer();
        for(String str:args){
            result.append(str + delim);
        }
        return result.toString();
    }

    public void varargsTest(){
        Common.println("varargsTest1 : " + concatenate("-", "1"));
        Common.println("varargsTest2 : " + concatenate("-", "1","2"));
        Common.println("varargsTest3 : " + concatenate("-", new String[]{"1","2","3"}));
        //아래 것은 안됨
//        Common.println("varargsTest3 : " + concatenate("-", {"1","2","3"}));
    }

    public void blockInitTest(){
        BlockTest blockTest = new BlockTest();
    }


    public void classTest(){
        생성자Class classes = new 생성자Class(3L);
        생성자Class classes1 = new 생성자Class(classes);


        Common.println(classes.getA() + "-" + classes.getB());
    }

}
