package views;

import java.util.Scanner;

public class CustomerView {
    private Scanner scanner;

    public CustomerView() {
        this.scanner = new Scanner(System.in);
    }

    public int showCustomerMenu() {
        System.out.println("====== Customer Menu ======");
        System.out.println("1. Account detail");
        System.out.println("2. Send money");
        System.out.println("3. => Money");
        System.out.println("4. Logout");
        System.out.print("Your choice: ");
        return  scanner.nextInt();
    }

    public void showAccountDetails() {

    }

    public double getDepositAmount() {
        System.out.println("Dang phat trien");
        return 1.0;
    }

    public void showSuccess(String message) {
        System.out.println("Success: " + message);
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}
