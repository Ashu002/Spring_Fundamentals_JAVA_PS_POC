package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;

/**
 * Created by ashutosh on 23/7/17.
 */
public interface CustomerService {
	List<Customer> findAll();
}
