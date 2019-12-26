package com.demo.service.impl;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2019/12/26.
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> query(String firstName) {
        List<Customer> customerList= (List<Customer>) customerRepository.findByFirstName(firstName);
        return customerList;
    }
}
