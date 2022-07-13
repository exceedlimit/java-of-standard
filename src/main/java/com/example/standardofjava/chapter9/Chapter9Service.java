package com.example.standardofjava.chapter9;

import com.example.standardofjava.Common;
import com.example.standardofjava.chapter9.model.ObjectTest;
import org.springframework.stereotype.Service;

@Service
public class Chapter9Service {

    public void objectTest(){
        ObjectTest objectTest1 = new ObjectTest(1);
        ObjectTest objectTest2 = new ObjectTest(1);
        Common.println("objectTest1.equals(objectTest2) : " + objectTest1.equals(objectTest2));

        ObjectTest objectTest3 = objectTest1.clone();
        objectTest3.getIntegerList().add(300);

        objectTest3.getIntegerList().stream().forEach((o)->{
            Common.println("objectTest3 IntegerList : " + o);
        });
        objectTest1.getIntegerList().stream().forEach((o)->{
            Common.println("objectTest1 IntegerList : " + o);
        });
        String str = "";
    }
}
