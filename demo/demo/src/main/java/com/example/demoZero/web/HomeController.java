package com.example.demoZero.web;

import com.example.demoZero.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping("/")    //expecting a html index file
    public String home(Model model)
    {
        model.addAttribute("formData",new User());
        return "index";  // the name of the webpage
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String processFormData(){
        return "";
    }
}
