package com.example.moduleapi.exception.handler;

import static com.example.modulecommon.enums.CodeEnum.UNKNOWN_ERROR;

import com.example.moduleapi.exception.CustomException;
import com.example.moduleapi.response.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse<String> customException(CustomException e) {
        return new CommonResponse<>(e.getCode(), e.getMessage(), "CustomError");
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse<String> handlerException(Exception e) {
        return new CommonResponse<>(UNKNOWN_ERROR.getCode(), e.getMessage(), UNKNOWN_ERROR.getMessage());
    }
}
