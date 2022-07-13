package com.example.standardofjava.chapter9;

import com.example.standardofjava.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter9")
@RequiredArgsConstructor
public class Chapter9Controller {

    private final Chapter9Service chapter9Service;

    @GetMapping("/object-test")
    public ApiResult objectTest(){
        chapter9Service.objectTest();
        return ApiResult.ok();
    }
}
