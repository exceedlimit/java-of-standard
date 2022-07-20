package com.example.standardofjava.chapter6;

import com.example.standardofjava.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter6")
@RequiredArgsConstructor
public class Chapter6Controller {

    private final Chapter6Service chapter6Service;

    @GetMapping("/variable-test")
    public ApiResult variablesTest(){
        chapter6Service.variablesTest();
        return ApiResult.ok();
    }

    @GetMapping("/type-test")
    public ApiResult typeTest(){
        chapter6Service.typeTest();
        return ApiResult.ok();
    }

    @GetMapping("/varargs-test")
    public ApiResult varargsTest(){
        chapter6Service.varargsTest();
        return ApiResult.ok();
    }

    @GetMapping("/block-init-test")
    public ApiResult blockInitTest(){
        chapter6Service.blockInitTest();
        return ApiResult.ok();
    }

    @GetMapping("/class-test")
    public ApiResult classTest(){
        chapter6Service.classTest();
        return ApiResult.ok();
    }

}
