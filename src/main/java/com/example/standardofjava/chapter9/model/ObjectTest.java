package com.example.standardofjava.chapter9.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter@Setter
public class ObjectTest implements Cloneable {
    private int id ;
    private List<Integer> integerList;

    public ObjectTest(int id){
        this.id = id;
        integerList = new ArrayList<>(){
            {
                add(100);
                add(200);
            }
        };
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof ObjectTest)
            return id == ((ObjectTest)obj).getId();
        else
            return false;
    }

    @Override
    public ObjectTest clone(){
        ObjectTest obj = null;
        try{
            //공변 반환타입
            obj= (ObjectTest) super.clone();
        }catch(CloneNotSupportedException e) {

        }finally {
            obj.setIntegerList(integerList.stream().collect(Collectors.toList()));
        }

        return  obj;
    }
}
