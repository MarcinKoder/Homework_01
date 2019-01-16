package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.coderslab.beans.CustomerLogger;

import java.time.LocalDateTime;
@Component
@Qualifier("SimpleCustomerLogger")
public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log(Customer customer, String message) {
        System.out.println(String.format("Użytkownik o id: %s, imieniu: %s, nazwisku: %s, pseudonimie: %s wykonał operację: Customer operation added by FileCustomerLogger \n",customer.getId(),customer.getName(),customer.getLastName(),customer.getPseudonym()));
    }

    @Override
    public void log(String message) {

    }


}
