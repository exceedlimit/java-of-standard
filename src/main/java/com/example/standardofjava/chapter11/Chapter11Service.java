package com.example.standardofjava.chapter11;

import com.example.standardofjava.chapter11.model.MyVector;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.example.standardofjava.Common.println;

@Service
public class Chapter11Service {

    public void arrayListTest(){
        ArrayList<Integer> integers = new ArrayList<>(){
            {
                add(300); add(200); add(1000); add(1);
            }
        };
        Collections.sort(integers);

        ArrayList<Integer> integers1 = new ArrayList<>(){
            {
                add(1); add(2);
            }
        };
        //내림으로 해야한다.
        for(int i = integers1.size() - 1; i >=0;i--){
            if(integers.contains(integers1.get(i))){
                integers1.remove(i);
            }
        }
    }

    public void myVectorTest(){
        MyVector v1 = new MyVector();
        MyVector v2 = new MyVector(3);

        println("v1 capacity : " + v1.capacity());
        println("v1 size : " + v1.size());
        println("v2 capacity : " + v2.capacity());
        println("v2 size : " + v2.size());
    }
    ///////////////////
    public void arrayListCompareWithLinkedList(){
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        println("= 순차적으로 추가하기 =");
        println("ArrayList : " + addContinue(al));
        println("LinkedList : " + addContinue(ll));
        println("= 중간에 추가하기 =");
        println("ArrayList : " + addInner(al));
        println("LinkedList : " + addInner(ll));
        println("= 순차적으로 삭제하기 =");
        println("ArrayList : " + removeContinue(al));
        println("LinkedList : " + removeContinue(ll));
        println("= 중간에 삭제하기 =");
        println("ArrayList : " + removeInner(al));
        println("LinkedList : " + removeInner(ll));

    }
    public long addContinue(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            list.add(i+"");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long addInner(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            list.add(500,"");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long removeContinue(List list){
        long start = System.currentTimeMillis();
        for(int i=list.size(); i>=0; i--){
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long removeInner(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    /////////////////////

}
