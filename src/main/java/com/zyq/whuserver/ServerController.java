package com.zyq.whuserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServerController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "City Ghost's first project";
    }
}
