package com.example.demo.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {

    @ResponseBody
    @GetMapping("/home")
    public String home(){
        System.out.println("InterceptorController 실행 !");
        return "Hello World !";
    }
}
