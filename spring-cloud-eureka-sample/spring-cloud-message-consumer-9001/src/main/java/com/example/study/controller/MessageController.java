package com.example.study.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {
    @Autowired // 注入我们刚刚定义的Bean
    private RestTemplate restTemplate;
    // 设置服务调用地址
    private static final String REST_URL_PREFIX = "http://MESSAGESERVICE";

    @GetMapping("/user/list")
    public JSONObject listUser() {
        // 下面的请求是发向http://MESSAGESERVICE/msg/list,但使用了LoadBalanced的restTemplate会帮我们转向到->
        //   服务列表中名为MESSAGESERVICE的某个实例的上去，比如某个实例地址为locahost:8001,那么请求最终为->
        //   localhost:8001/msg/list
        return restTemplate.getForObject(REST_URL_PREFIX + "/msg/list", JSONObject.class);
    }
}
