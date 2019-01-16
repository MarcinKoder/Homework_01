package pl.coderslab.beans;



import java.io.FileWriter;
import java.io.IOException;



public class FileCustomerLogger implements CustomerLogger {
    private String fileName;
    public FileCustomerLogger(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(Customer customer, String message) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.append(customer.getId()+ " " + customer.getName()+ " " + customer.getLastName()+ " " + customer.getPseudonym() + " Customer operation added by FileCustomerLogger \n");
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {

    }
}
