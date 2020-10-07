package com.example.demoZero.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")    //expecting a html index file
    public String home()
    {
        return "index"// the name of the webpage
    }
}
