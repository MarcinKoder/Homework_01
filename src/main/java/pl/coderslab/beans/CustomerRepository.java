package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository {
    void add(Customer customer);
    void delete(Customer customer);
    void getAll(Customer customer);
}
