package com.example.standardofjava.chapter8.model;

import com.example.standardofjava.Common;

public class ResourcesTest implements AutoCloseable {
    public void makeException(Boolean bool) throws Exception{
        Common.println("makeException 호출!! bool: "+ bool);
        if(bool)
            throw new Exception("Work Exception 발생!!!");
    }

    @Override
    public void close() throws Exception {
        Common.println("close 호출 !!!");
        throw new Exception("Close Exception 발생!!");
    }
}
