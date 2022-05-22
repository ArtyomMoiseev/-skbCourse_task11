package com.example.skb_course_hw6.actuator;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "dateTime")
public class LogDataTimeInvokeActuator {


    @ReadOperation
    public Map<String, String> logDateTime() throws JSONException {
        var map = new HashMap<String, String>();
        map.put("status", "OK");

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(new Date()));
        return map;
    }

}
