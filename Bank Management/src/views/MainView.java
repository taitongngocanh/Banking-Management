package views;

import java.util.Scanner;

public class MainView {
    public Scanner scanner;

    public MainView() {
        this.scanner = new Scanner(System.in);
    }

    public int showMainMenu() {
        System.out.println("====== Banking System ======");
        System.out.println("1. Login for Customer");
        System.out.println("2. Login for Admin");
        System.out.println("3. Exist");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }

    public String[] getLoginCredentials() {
        scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        return new String[] {username, password};
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    public void showSuccess(String message) {
        System.out.println("Success: " + message);
    }
}
