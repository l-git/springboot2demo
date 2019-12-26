package com.demo.controllers;

import com.demo.model.Customer;
import com.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2019/12/26.
 */

@RestController
public class IndexController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/")
    public Object index(String firstName){
        List<Customer> customerList=customerService.query(firstName);
        return customerList;
    }

}
