package com.example.standardofjava.chapter11;

import com.example.standardofjava.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter11")
@RequiredArgsConstructor
public class Chapter11Controller {

    private final Chapter11Service chapter11Service;

    @GetMapping("/array-list-test")
    public ApiResult arrayListTest(){
        chapter11Service.arrayListTest();
        return ApiResult.ok();
    }

    @GetMapping("/my-vector-test")
    public ApiResult myVectorTest(){
        chapter11Service.myVectorTest();
        return ApiResult.ok();
    }
    @GetMapping("/list-compare-test")
    public ApiResult arrayListCompareWithLinkedList(){
        chapter11Service.arrayListCompareWithLinkedList();
        return ApiResult.ok();
    }
}
