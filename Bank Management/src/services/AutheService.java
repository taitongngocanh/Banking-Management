package services;

import models.Admin;
import models.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AutheService {
    private List<Customer> customers;
    private Customer currentCustomer;

    public AutheService() {
        this.customers = new ArrayList<>();
        loadCustomersFromFile();
    }

    public Customer customerLogin(String username, String password) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                currentCustomer = customer;
                return customer;
            }
        }
        return null;
    }

    public void customerLogout() {
        currentCustomer = null;
    }

    private void loadCustomersFromFile() {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("resources//customers.txt");
            if (inputStream == null) {
                throw new IOException("File customers.txt không tìm thấy");
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("(") && line.endsWith(")")) {
                    line = line.substring(1, line.length() - 1);
                    String[] parts = line.split(",\\s*");
                    if (parts.length == 2) {
                        String username = parts[0].trim();
                        String password = parts[1].trim();
                        customers.add(new Customer(username, password, username + "_ACC"));
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file customers.txt: " + e.getMessage());
        }


    }
}
