package com.example.modulecommon.enums;

public enum CodeEnum {
    SUCCESS("0000", "SUCCESS"),
    UNKNOWN_ERROR("9999", "UNKNOWN_ERROR")
    ;

    private final String code;
    private final String message;

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
