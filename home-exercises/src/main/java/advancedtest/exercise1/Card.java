package advancedtest.exercise1;

public abstract class  Card {
    private int number;
    private String fullName;
    private int ccv;
    private double balance;

    public Card(int number, String fullName, int ccv, double balance) {
        this.number = number;
        this.fullName = fullName;
        this.ccv = ccv;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void addMoney(double sum);
    public abstract void takeMoney(double sum) throws NotEnoughFundsException;
}
