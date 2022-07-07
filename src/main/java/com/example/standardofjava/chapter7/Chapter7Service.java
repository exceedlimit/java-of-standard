package com.example.standardofjava.chapter7;

import com.example.standardofjava.Common;
import com.example.standardofjava.chapter7.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Chapter7Service {

    public void parentTest(){
        ChildrenClass childrenClass = new ChildrenClass();
        Common.println("defaultTestMemberToString : " + childrenClass.defaultTestMemberToString());
        Common.println("childTestMemberToString : " + childrenClass.childTestMemberToString());
        childrenClass.setParentTestMember1("Change1");
        childrenClass.setParentTestMember2("Change2");
        Common.println("testMemberToString : " + childrenClass.testMemberToString());

        //다형성성
       ParentClass parentClass = new ChildrenClass();
        //객체는 ParentClass로 선언되어 있기때문에 ChildrenClass 객체로 대입되어 있어도 사용은 불가.
//        parentClass.defaultTestMemberToString();
//        parentClass.childrenClass();
        Common.println("parent Class to String : " + parentClass.toString());
        Common.println("testMemberToString : " + parentClass.testMemberToString());

    }
    //////////////////////////

    public void singletonTest(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        printSingleton(singleton1,singleton2);

        singleton1.setTest1(1000);
        printSingleton(singleton1,singleton2);

    }
    public void printSingleton(Singleton singleton1, Singleton singleton2){
        Common.println("singleton1 test1 :" + singleton1.getTest1());
        Common.println("singleton2 test1 :" + singleton2.getTest1());
    }

    public void testInstance(){
        testInstanceSuccess();
        testInstanceError();
    }

    public void testInstanceSuccess(){
        ChildrenClass childrenClass1 = new ChildrenClass();
        ParentClass parentClass1 = null;
        parentClass1 = childrenClass1;
        Common.println(parentClass1.getTestMember1());
        Common.println(parentClass1.testMemberToString());

        ChildrenClass childrenClass2 = null;
        childrenClass2 = (ChildrenClass) parentClass1;
        Common.println(childrenClass2.getTestMember1());
        Common.println(childrenClass2.testMemberToString());

    }

    public void testInstanceError(){
        ParentClass parentClass = new ParentClass();
        ChildrenClass childrenClass = null;

        childrenClass = (ChildrenClass) parentClass; // 에러 발생. 근본적으로 parentClass의 인스턴스는 ParentClass이기 때문.
        //이러한 것을 막기위해 instanceof가 있다.
        if(parentClass instanceof ChildrenClass){
            childrenClass = (ChildrenClass) parentClass;
        }
    }

    public void abstractTest(){
        List<AbstractClass> abstractClasses = new ArrayList<>(){
            {
                add(new AbstractClassImpl1());
                add(new AbstractClassImpl2());
            }
        };
        abstractClasses.stream().forEach(o -> o.print());

    }
}
