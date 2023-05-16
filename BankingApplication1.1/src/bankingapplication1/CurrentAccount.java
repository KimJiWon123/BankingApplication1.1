/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication1;

/**
 *
 * @author user
 */
public class CurrentAccount implements Account {

    private int accountNumber;
    private String accountName;
    private double balance;
    private double minimum;
    private final String accountType = "CurrentAccount";

    public CurrentAccount(int accountNumber, String accountName, double balance, double minimum) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.minimum = minimum;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public double getMinimum() {
        return this.minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
    
    @Override
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getAccountType() {
        return this.accountType;
    }
}
