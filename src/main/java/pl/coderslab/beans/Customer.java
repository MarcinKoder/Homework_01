package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Long id;
    private String name;
    private String lastName;

    private String pseudonym;

    public Customer(Long id, String name, String lastName, String pseudonym) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }
    public Customer(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

}
