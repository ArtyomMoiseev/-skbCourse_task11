package com.example.skb_course_hw6.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class AddIdToJson {

    @PostMapping(value = "/addIdToJson")
    public ResponseEntity<String> addIdToJson(@RequestBody String body) throws JSONException {
        var json = new JSONObject(body);
        json.getJSONObject("info").put("id", 123);
        return new ResponseEntity<String>(json.toString(), HttpStatus.OK);
    }
}
