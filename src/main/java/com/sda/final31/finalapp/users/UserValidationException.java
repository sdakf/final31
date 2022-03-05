package com.sda.final31.finalapp.users;

import lombok.Getter;

import java.util.Map;

public class UserValidationException extends RuntimeException{

    @Getter
    private Map<String, String> errorMap;

    public UserValidationException(Map<String, String> errorMap) {
        this.errorMap = errorMap;
    }
}
