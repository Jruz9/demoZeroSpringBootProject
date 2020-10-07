package com.example.demoZero.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {

    @RequestMapping(value = "/basic")//defaults to get request
    public String  sayHello()
    {
        return "<h1>Hello</h1>";
    }
    @RequestMapping(value = "/proper",method = RequestMethod.GET)
    public String  sayProperHello()
    {
        return "<h1>Hello there, how are you</h1>";
    }
    @RequestMapping("/user_entry")
    public String userForm() {
        return "<form action=\"/greetings/user_greeting\" method=\"POST\">\n" +
                "  First Name<br>\n" +
                "  <input type=\"text\" name=\"firstname\"><br>\n" +
                "  Last Name:<br>\n" +
                "  <input type=\"text\" name=\"lastname\"><br>\n" +
                "  <br>\n" +
                "  <input type=\"submit\"  value=\"submit\">\n" +
                "</form>";
    }
    @RequestMapping(value = "/user_greeting", method = RequestMethod.POST)
    public String printUserGreeting(@RequestParam String firstname,@RequestParam String lastname)
    {
        return "Hello there,"+firstname+", "+lastname;

    }
}
