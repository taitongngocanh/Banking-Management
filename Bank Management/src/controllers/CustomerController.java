package controllers;

import models.Customer;
import services.AutheService;
import views.CustomerView;

public class CustomerController {
    private CustomerView customerView;
    private AutheService autheService;

    public CustomerController(CustomerView customerView, AutheService autheService) {
        this.customerView = customerView;
        this.autheService = autheService;
    }

    public void handleCustomerSession(Customer customer) {
        while (true) {
            int choice = customerView.showCustomerMenu();
        }
    }
}
