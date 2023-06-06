package com.wzbc.boy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/sayhello")
    public Map sayHello() {
        Map map = new HashMap();
        map.put("name", "Jason");
        map.put("age", 18);
        map.put("sex","男");
        return map;
    }
}
