import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.AppConfig;
import com.pluralsight.service.CustomerService;

/**
 * Created by ashutosh on 23/7/17.
 */
public class Application {
	public static void main(String... args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = applicationContext.getBean("customerService1", CustomerService.class);
		System.out.println(service);

		// now we will create another instance but the address of CustomerService object will be same
		CustomerService service1 = applicationContext.getBean("customerService1", CustomerService.class);
		System.out.println(service1); // will be different address if scope is prototype
		System.out.println(service.findAll().get(0).getFirstName());
	}
}
