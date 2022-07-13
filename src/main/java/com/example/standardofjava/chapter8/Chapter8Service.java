package com.example.standardofjava.chapter8;

import com.example.standardofjava.Common;
import com.example.standardofjava.chapter8.model.ResourcesTest;
import com.example.standardofjava.chapter8.model.TestException;
import org.springframework.stereotype.Service;

@Service
public class Chapter8Service {
    public void exceptionTest(){
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

    public void finallyTest(Boolean bool){
        try{
            if(!bool) throw new Exception("예외발생!!");
            Common.println("try의 return 전");
            return;
//            Common.println("try의 return 후");
        }catch(Exception e){
            Common.println("catch의 return 전 : " + e.getMessage());
            return;
//            Common.println("catch의 return 후 : ");
        }finally {
            Common.println("finally 실행");
        }
    }

    public void resourceTest(){
        try(ResourcesTest resourcesTest = new ResourcesTest()){
            resourcesTest.makeException(false);
        }catch (Exception e){
            Common.println("발생한 예외 : " + e.getMessage());
            e.printStackTrace();
        }
        try(ResourcesTest resourcesTest = new ResourcesTest()){
            resourcesTest.makeException(true);
        }catch (Exception e){
            Common.println("발생한 예외 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
