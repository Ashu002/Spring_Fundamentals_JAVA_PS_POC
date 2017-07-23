package com.pluralsight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by ashutosh on 23/7/17.
 */

// Before Autowired
/*@Configuration // This annotation replaces the applicationContext.xml
public class AppConfig {

	@Bean(name = "customerService1")
	public CustomerService getCustomerService(){
		//Demo for setter injection
		*//*CustomerServiceImpl service =  new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;*//*

		//Demo for constructor injection
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		return service;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImp();
	}
}*/

//After Autowired
@Configuration // This annotation replaces the applicationContext.xml
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

	//For Properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	//instead of this we can use @service annotation (Power of annotation)
	/*@Bean(name = "customerService1")
	public CustomerService getCustomerService(){

		//Demo for autowired
		return new CustomerServiceImpl();

		//Demo for setter injection
		*//*CustomerServiceImpl service =  new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;*//*

		//Demo for constructor injection
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		//return service;
	}*/

	//Instead this code we can use the @Repository annotation (Power of annotation)
	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImp();
	}*/
}

