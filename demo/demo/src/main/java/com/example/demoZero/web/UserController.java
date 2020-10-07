package com.example.demoZero.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable Integer userId)
    {
        return "User Found "+userId;
    }
    @RequestMapping("{userId}/invoices")
    public String displayUserInvoices(@PathVariable int userId,
                                      @RequestParam(value = "date",required = false) Date dateOrNull)
    {
        return "invoice found for user:"+userId+"on the date:"+dateOrNull;
    }


}
