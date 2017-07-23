package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Customer;

/**
 * Created by ashutosh on 23/7/17.
 */
public interface CustomerRepository {
	List<Customer> findAll();
}
