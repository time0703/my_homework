package com.mine.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "hello/request")
    public  @ResponseBody String request(){
        return "hello world!";
    }

    @RequestMapping (value = "hello/get")
    public @ResponseBody String get(@RequestParam Integer num){
        int num0 = num + 1;
        return "获得了参数 " + num +
                "<br/>返回了参数 " + num0;
    }
}
