package Adapter;

public class PBank {
    private int balance;
    public PBank() {
        balance = 100;
    }
    public void getBalance() {
        System.out.println("PBank balance = " + balance);
    }
}
