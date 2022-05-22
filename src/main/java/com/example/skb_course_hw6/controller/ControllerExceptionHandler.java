package com.example.skb_course_hw6.controller;

import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(JSONException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public String handleException() {
        return "Json parsing error";
    }
}
