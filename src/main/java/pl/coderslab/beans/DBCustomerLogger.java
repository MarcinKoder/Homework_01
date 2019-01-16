package pl.coderslab.beans;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.sql.SQLException;
import java.sql.Timestamp;

@Component
@Qualifier("DBCustomerLogger")
public class DBCustomerLogger implements CustomerLogger {
    @Override
    public void log(Customer customer,String message) {
        DbCustomerLog dbCustomerLog = new DbCustomerLog(new Timestamp(System.currentTimeMillis()),"Dodano do bazy danych");
        try {
            DbCustomerLogDAO.saveToDb(dbCustomerLog);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {

    }
}

