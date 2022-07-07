package com.example.standardofjava.chapter8;

import com.example.standardofjava.Common;
import com.example.standardofjava.chapter8.model.TestException;
import org.springframework.stereotype.Service;

@Service
public class Chapter8Service {
    public void ExceptionTest(){
        try{
            throw new TestException();
        }catch(TestException e){
            Common.println("e.printStackTrace : " + e.getMessage());
        }

        try {
            throw new Exception("고의성");
        }catch(Exception e){
            Common.println("e.printStackTrace : " + e.getMessage());
        }
    }
}
