package pl.coderslab.beans;

import java.sql.Timestamp;

public class DbCustomerLog {
    private Long id;
    private Timestamp datetime;
    private String message;

    public DbCustomerLog(Timestamp datetime, String message) {
        this.datetime = datetime;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
