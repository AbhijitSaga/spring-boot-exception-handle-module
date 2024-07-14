package com.excep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ExceptionController {
//Note - ExceptionController is a global exception handler class to handle all exception  is there using  method

    // my first learning step -it simply handle it, and it handles predefined  execution not custom exception
    @ExceptionHandler(RuntimeException.class)
    ResponseEntity<?> runtimeException( RuntimeException  ex){
        return ResponseEntity.badRequest().body( "Exception directly throws by  ExceptionController it is global Exception class");
    }


    // my first learning step -it simply handle it, and it handles predefined  execution not custom exception
    @ExceptionHandler(CustomExceptionClass.class)
    ResponseEntity<?> runtimeCustomExceptionHandle(CustomExceptionClass  ex , WebRequest webRequest){
      ErrorDetailsClass errorDetailsClass=new ErrorDetailsClass(new Date(), ex.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetailsClass, HttpStatus.NOT_ACCEPTABLE);
    }

}
