package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.CustomerRepository;

public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Zadanie 3");
        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        Customer customer = context.getBean(Customer.class);
        customer.setId(1L);
        customer.setName("Marian");
        customer.setLastName("Kowalski");
        customer.setPseudonym("Kowal");
        customerRepository.add(customer);


    }
}
