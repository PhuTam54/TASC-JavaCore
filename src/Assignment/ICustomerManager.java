package Assignment;

import java.io.IOException;

public interface ICustomerManager {
    void addCustomer(Customer customer);
    Customer findByPhoneNumber(String customerPhoneNumber);
    void printAllCustomer();
    void updateCustomer(String customerPhoneNumber, Customer customer);
    void removeCustomer(String customerPhoneNumber);
    void loadFromFile(String filename) throws IOException, ClassNotFoundException;
    void saveToFile(String filename) throws IOException;
}
