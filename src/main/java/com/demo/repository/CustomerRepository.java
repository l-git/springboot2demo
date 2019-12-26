package com.demo.repository;

import com.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admin on 2019/12/26.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long>{

    List<Customer> findByFirstName(String firstName);


}
