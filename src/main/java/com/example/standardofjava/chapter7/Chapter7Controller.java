package com.example.standardofjava.chapter7;

import com.example.standardofjava.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter7")
@RequiredArgsConstructor
public class Chapter7Controller {
    private final Chapter7Service chapter7Service;

    @GetMapping("/parent-test")
    public ApiResult parentTest(){
        chapter7Service.parentTest();
        return ApiResult.ok();
    }

    @GetMapping("/singleton-test")
    public ApiResult singletonTest(){
        chapter7Service.singletonTest();
        return ApiResult.ok();
    }

    @GetMapping("/instance-test")
    public ApiResult testInstance(){
        chapter7Service.testInstance();
        return ApiResult.ok();
    }
    @GetMapping("/abstract-test")
    public ApiResult abstractTest(){
        chapter7Service.abstractTest();
        return ApiResult.ok();
    }

}
