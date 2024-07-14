package com.excep.controller;

import com.excep.exception.CustomExceptionClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    //it method handle normal use to create and handle first time exception
  @GetMapping(value = "/cal")
    ResponseEntity<?> calculation(){
       return ResponseEntity.ok(10/0);
    }

    //it method handle normal use to create and handle second time for custom exception

    @GetMapping(value = "/calculate")
    ResponseEntity<?> calculationSecond(){
        try {
            int result = 10 / 0; // This will cause a division by zero exception
            return ResponseEntity.ok().body(result);
        } catch (ArithmeticException ex) {
            throw new CustomExceptionClass(" Custom ArithmeticException created by me:  Division by zero");
        }
    }
}
