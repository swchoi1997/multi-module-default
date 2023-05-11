package com.example.moduleapi.response;

import com.example.modulecommon.enums.CodeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(Include.NON_NULL)
public class CommonResponse<T> {

    private final String code;
    private final String message;
    private final T info;

    public CommonResponse(final CodeEnum codeEnum, final T info) {
        this(codeEnum.getCode(), codeEnum.getMessage(), info);
    }

    public CommonResponse(final String code, final String message, final T info) {
        this.code = code;
        this.message = message;
        this.info = info;
    }

}
