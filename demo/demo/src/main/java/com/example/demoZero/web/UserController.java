package com.example.demoZero.web;

import com.example.demoZero.domain.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/{userId}/items")
    public List<String> displayStringJson()
    {
        return Arrays.asList("shoes","laptop","button");
    }
    @RequestMapping("/{userId}/products_as_json")
    public List<Product> displayProductsJson()
    {
        return Arrays.asList(new Product(1,"shoes",42.99),
                            new Product(2,"Books",12.99),
                            new Product(3,"bag",45.99));
    }
}
