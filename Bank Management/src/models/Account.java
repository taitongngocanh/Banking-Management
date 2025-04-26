package models;

public class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerNamne, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerNamne;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerNamne() {
        return customerName;
    }

    public void setCustomerNamne(String customerNamne) {
        this.customerName = customerNamne;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
