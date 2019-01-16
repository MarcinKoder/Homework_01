package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryCustomerRepository implements CustomerRepository {
    private static   List<Customer> customerList = new ArrayList<>();
    CustomerLogger logger;
    CustomerLogger logger2;
    @Override
    public void add(Customer customer) {
       customerList.add(customer);
       logger2.log(customer,"xD");
        logger.log(customer,"Dodano nowego użytkownika");
    }
@Autowired
    public MemoryCustomerRepository(@Qualifier("SimpleCustomerLogger")CustomerLogger customerLogger,@Qualifier("DBCustomerLogger") CustomerLogger customerLogger2) {
        this.logger = customerLogger;
        this.logger2 = customerLogger2;
    }

    @Override
    public void delete(Customer customer) {
        logger.log(customer, "Usunięto użytkownika");
    }

    @Override
    public void getAll(Customer customer) {
        logger.log(customer, "Pobrano użytkownika");
    }
}
