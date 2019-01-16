package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public interface CustomerLogger {
    void log(Customer customer, String message);
    void log(String message);
}
