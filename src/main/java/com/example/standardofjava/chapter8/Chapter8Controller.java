package com.example.standardofjava.chapter8;

import com.example.standardofjava.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter8")
@RequiredArgsConstructor
public class Chapter8Controller {

    private final Chapter8Service chapter8Service;

    @GetMapping("/exception-test")
    public ApiResult exceptionTest(){
        chapter8Service.exceptionTest();
        return ApiResult.ok();
    }

    @GetMapping("/finally-test")
    public ApiResult finallyTest(@RequestParam Boolean bool){
        chapter8Service.finallyTest(bool);
        return ApiResult.ok();
    }

    @GetMapping("/resource-test")
    public ApiResult resourceTest(){
        chapter8Service.resourceTest();
        return ApiResult.ok();
    }
}
