package controllers;

import models.Customer;
import services.AutheService;
import views.MainView;

public class MainController {
    private MainView mainView;
    private AutheService autheService;
    private CustomerController customerController;

    public MainController(MainView mainView, AutheService autheService) {
        this.mainView = mainView;
        this.autheService = autheService;
        this.customerController = new CustomerController(new views.CustomerView(), autheService);
    }

    public void start() {
        while (true) {
            int choice = mainView.showMainMenu();
            if (choice == 1) {
                String[] credentials = mainView.getLoginCredentials();
                Customer customer = autheService.customerLogin(credentials[0], credentials[1]);
                if (customer != null) {
                    mainView.showSuccess("Welcome: " + customer.getUsername());
                    customerController.handleCustomerSession(customer);
                } else {
                    mainView.showError("Your information is not correct!!!");
                }
            } else if (choice == 2) {

            } else if (choice == 3) {
                mainView.showSuccess("Good bye ~~~");
            } else {
                mainView.showError("Your choice is not suitable !!!");
            }
        }
    }
}
