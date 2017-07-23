package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

/**
 * Created by ashutosh on 23/7/17.
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImp implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	@Override
	public List<Customer> findAll(){
		System.out.println(this.getDbUsername());

		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Raj");
		customer.setLastName("Ojha");
		customers.add(customer);
		return customers;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
}
