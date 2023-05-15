package com.example.moduleapi.exception;


import com.example.modulecommon.enums.CodeEnum;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final String code;
    private final String message;


    public CustomException(final CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }


}
