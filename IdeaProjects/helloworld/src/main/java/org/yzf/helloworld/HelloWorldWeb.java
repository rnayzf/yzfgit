package org.yzf.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldWeb {
    @RequestMapping("/hi")
    public String hello(){
        return "this is my first application!";
    }
}
