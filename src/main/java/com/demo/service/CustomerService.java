package com.demo.service;

import com.demo.model.Customer;

import java.util.List;

/**
 * Created by admin on 2019/12/26.
 */
public interface CustomerService {

    List<Customer> query(String firstName);

}
