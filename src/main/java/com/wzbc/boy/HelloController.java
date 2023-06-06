package com.wzbc.boy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Value("${cupSize}")
    private Integer cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${name}")
    private String name;

    @Value("${content}")
    private String content;

    @GetMapping("/getCupSize")
    public String getCupSize() {
        return "My cup size is:" + cupSize;
    }

    @GetMapping("/getInfo")
    public Map getInfo() {
        Map map = new HashMap();
        map.put("name", name);
        map.put("age", age);
        map.put("cupSize", cupSize);
        map.put("content", content);
        return map;
    }

    @GetMapping("/sayhello")
    public Map sayHello() {
        Map map = new HashMap();
        map.put("name", "Jason");
        map.put("age", 18);
        map.put("sex","男");
        return map;
    }
}
