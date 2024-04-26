package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerList = new CustomerManager();
        String filename = "CustomerManagement.txt";
        try {
            customerList.loadFromFile(filename);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred. Please try again.");
        }

        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------MENU-------------");
            System.out.println("1. Add new customer");
            System.out.println("2. Find customer by phone number");
            System.out.println("3. Display all customer");
            System.out.println("4. Update customer");
            System.out.println("5. Remove customer");
            System.out.println("0. Exit");
            do {
                try {
                    System.out.println("Enter a number (0-5)");
                    choose = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    choose = -1;
                    sc.nextLine();
                }
            } while (!Utils.isNumeric(String.valueOf(choose)) || choose == -1);
            switch (choose) {
                case 1 -> {
                    int n;
                    do {
                        try {
                            System.out.println("How many customers do you want to add?");
                            n = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            n = 0;
                            sc.nextLine();
                        }
                    } while (!Utils.isNumeric(String.valueOf(n)) || n <= 0);
                    for (int i = 0; i < n; i++) {
                        Customer customer = new Customer();
                        System.out.println("Enter " + (i + 1) + " customer name: ");
                        String customerName = sc.nextLine();
                        while (!Utils.isName(customerName)) {
                            System.out.println("Name is invalid, Please try again! (Name must be at least 2 characters)");
                            customerName = sc.nextLine();
                        }
                        customer.setCustomerName(customerName);

                        System.out.println("Enter " + (i + 1) + " customer email: ");
                        String customerEmail = sc.nextLine();
                        while (!Utils.isEmail(customerEmail)) {
                            System.out.println("Email is invalid, Please try again! (Email must contain '@' and '.' and '@' must be before '.')");
                            customerEmail = sc.nextLine();
                        }
                        customer.setCustomerEmail(customerEmail);

                        System.out.println("Enter " + (i + 1) + " customer phone number: ");
                        String customerPhoneNumber = sc.nextLine();
                        while (!Utils.isPhoneNumber(customerPhoneNumber)) {
                            System.out.println("Phone number is invalid, Please try again! (Phone number must be 10 or 11 digits and start with '0')");
                            customerPhoneNumber = sc.nextLine();
                            if (customerList.findByPhoneNumber(customerPhoneNumber) != null) {
                                System.out.println("Phone number is already existed, Please try again!");
                                customerPhoneNumber = sc.nextLine();
                            }
                        }
                        customer.setCustomerPhoneNumber(customerPhoneNumber);

                        customerList.addCustomer(customer);
                    }
                    try {
                        customerList.saveToFile(filename);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("An error occurred. Please try again.");
                    }
                    System.out.println("\nCustomer added successfully!");
                }
                case 2 -> {
                    System.out.println("Enter customer phone number: ");
                    String customerFindingPhoneNumber = sc.nextLine();
                    Customer foundedCustomer = customerList.findByPhoneNumber(customerFindingPhoneNumber);
                    if (foundedCustomer == null) {
                        System.out.println("Customer not found!");
                    } else {
                        System.out.println(foundedCustomer);
                    }
                    System.out.println("\nCustomer found successfully!");
                }
                case 3 -> {
                    customerList.printAllCustomer();
                    System.out.println("\nCustomer printed successfully!");
                }
                case 4 -> {
                    System.out.println("Enter customer phone number that you want to update: ");
                    String customerUpdatePhoneNumber = sc.nextLine();
                    Customer customerUpdate = customerList.findByPhoneNumber(customerUpdatePhoneNumber);
                    if (customerUpdate == null) {
                        System.out.println("Customer not found!");
                    } else {
                        int choice;
                        do {
                            System.out.println("Which information do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Email");
                            System.out.println("3. All");
                            System.out.println("0. Cancel");
                            do {
                                try {
                                    System.out.println("Enter a number (0-4)");
                                    choice = sc.nextInt();
                                    sc.nextLine();
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    choice = -1;
                                    sc.nextLine();
                                }
                            } while (!Utils.isNumeric(String.valueOf(choice)) || choice == -1);
                            switch (choice) {
                                case 1 -> {
                                    System.out.println("Enter new name: ");
                                    String newName = sc.nextLine();
                                    while (!Utils.isName(newName)) {
                                        System.out.println("Name is invalid, Please try again! (Name must be at least 2 characters)");
                                        newName = sc.nextLine();
                                    }
                                    customerUpdate.setCustomerName(newName);
                                    customerList.updateCustomer(customerUpdatePhoneNumber, customerUpdate);
                                    try {
                                        customerList.saveToFile(filename);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        System.out.println("An error occurred. Please try again.");
                                    }
                                    System.out.println("\nCustomer updated successfully!");
                                    choice = 0;
                                }
                                case 2 -> {
                                    System.out.println("Enter new email: ");
                                    String newEmail = sc.nextLine();
                                    while (!Utils.isEmail(newEmail)) {
                                        System.out.println("Email is invalid, Please try again! (Email must contain '@' and '.' and '@' must be before '.')");
                                        newEmail = sc.nextLine();
                                    }
                                    customerUpdate.setCustomerEmail(newEmail);
                                    customerList.updateCustomer(customerUpdatePhoneNumber, customerUpdate);
                                    try {
                                        customerList.saveToFile(filename);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        System.out.println("An error occurred. Please try again.");
                                    }
                                    System.out.println("\nCustomer updated successfully!");
                                    choice = 0;
                                }
                                case 3 -> {
                                    System.out.println("Enter new name: ");
                                    String newName = sc.nextLine();
                                    while (!Utils.isName(newName)) {
                                        System.out.println("Name is invalid, Please try again! (Name must be at least 2 characters)");
                                        newName = sc.nextLine();
                                    }
                                    customerUpdate.setCustomerName(newName);

                                    System.out.println("Enter new email: ");
                                    String newEmail = sc.nextLine();
                                    while (!Utils.isEmail(newEmail)) {
                                        System.out.println("Email is invalid, Please try again! (Email must contain '@' and '.' and '@' must be before '.')");
                                        newEmail = sc.nextLine();
                                    }
                                    customerUpdate.setCustomerEmail(newEmail);

                                    customerList.updateCustomer(customerUpdatePhoneNumber, customerUpdate);
                                    try {
                                        customerList.saveToFile(filename);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        System.out.println("An error occurred. Please try again.");
                                    }
                                    System.out.println("\nCustomer updated successfully!");
                                    choice = 0;
                                }
                                case 0 -> System.out.println("Cancel updating customer!");
                                default -> System.out.println("Invalid choice. Please try again.");
                            }
                        } while (choice != 0);
                    }}
                case 5 -> {
                    System.out.println("Enter customer phone number that you want to delete: ");
                    String customerDeletePhoneNumber = sc.nextLine();
                    if (customerList.findByPhoneNumber(customerDeletePhoneNumber) == null) {
                        System.out.println("Customer not found!");
                    } else {
                        customerList.removeCustomer(customerDeletePhoneNumber);
                        try {
                            customerList.saveToFile(filename);
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("An error occurred. Please try again.");
                        }
                        System.out.println("\nCustomer Deleted successfully!");
                    }
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }
}
