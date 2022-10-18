package advancedtest.exercise1;

public class CreditCard extends Card {

    public CreditCard(int number, String fullName, int ccv, double balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public void addMoney(double sum) {
        this.setBalance(getBalance() + sum);
    }

    @Override
    public void takeMoney(double sum) throws NotEnoughFundsException {
        if (getBalance() < sum) {
            throw new NotEnoughFundsException("Not enough funds!");
        } else {
            setBalance(getBalance() - sum);
        }
        if (getBalance() < 100) {
            System.out.println("Warning: low funds!");
        }
    }
}
