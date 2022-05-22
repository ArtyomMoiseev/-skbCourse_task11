package com.example.skb_course_hw6;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RequestHeaders {
    @GetMapping(value = "/getRequestHeaders")
    public ResponseEntity<Map> getRequestHeaders(@RequestHeader Map<String, String> headers) {
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
}
