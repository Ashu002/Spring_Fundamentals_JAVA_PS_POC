package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

/**
 * Created by ashutosh on 23/7/17.
 */
@Service("customerService1") // Stereotype annotation

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImp();

	public CustomerServiceImpl(){

	}
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	//Setter Injector Demo
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using setter injection");
		this.customerRepository = customerRepository;
	}
}
