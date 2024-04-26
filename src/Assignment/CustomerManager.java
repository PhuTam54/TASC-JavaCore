package Assignment;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerManager implements ICustomerManager {
    private final Map<String, Customer> customerMap = new HashMap<>();
    @Override
    public void addCustomer(Customer customer) {
        this.customerMap.put(customer.getCustomerPhoneNumber(), customer);
    }

    @Override
    public Customer findByPhoneNumber(String customerPhoneNumber) {
        return customerMap.getOrDefault(customerPhoneNumber, null);
    }

    @Override
    public void printAllCustomer() {
        System.out.println("\t\tCustomer management");
        System.out.println("Name\t\tPhone number");
        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    @Override
    public void updateCustomer(String customerPhoneNumber, Customer customer) {
        if (customerMap.containsKey(customerPhoneNumber)) {
            customerMap.put(customerPhoneNumber, customer);
        } else {
            System.out.println("Customer not found!");
        }
    }

    @Override
    public void removeCustomer(String customerPhoneNumber) {
        if (customerMap.containsKey(customerPhoneNumber)) {
            customerMap.remove(customerPhoneNumber);
        } else {
            System.out.println("Customer not found!");
        }
    }

    @Override
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        InputStream inputStream = Files.newInputStream(new File("src/Assignment/" + filename).toPath());
        Customer customer;
        try (inputStream; ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            while ((customer = (Customer) objectInputStream.readObject()) != null) {
                customerMap.put(customer.getCustomerPhoneNumber(), customer);
            }
        } catch (EOFException e) {
            System.out.println("Read file successfully!");
        }
    }

    @Override
    public void saveToFile(String filename) throws IOException {
        OutputStream outputStream = Files.newOutputStream(new File("src/Assignment/" + filename).toPath());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.close();
        outputStream.close();
    }
}