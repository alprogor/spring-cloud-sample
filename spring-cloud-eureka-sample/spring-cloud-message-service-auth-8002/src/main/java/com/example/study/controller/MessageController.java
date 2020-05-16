package com.example.study.controller;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/msg/list")
    public JSONObject list(){
        JSONObject obj = new JSONObject();
        obj.put("msg","list调用成功");
        return obj;
    }
}
