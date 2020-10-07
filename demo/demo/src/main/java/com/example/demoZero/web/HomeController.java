package com.example.demoZero.web;

import com.example.demoZero.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @RequestMapping("/")    //expecting a html index file
    public String home(Model model)
    {
        model.addAttribute("formData",new User());
        return "index";  // the name of the webpage
    }
    @RequestMapping(value = "/display",method = RequestMethod.GET)  //get request display the result
    public String displayFormData(User user)
    {
        return "result";
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String processFormData(User user, RedirectAttributes attr){
        //Insert data submitted in the form to the database.
        //redirects dont transfer data
        attr.addFlashAttribute("user",user);    //redirect attributes transfers data
        return "redirect:/display";
    }
}
