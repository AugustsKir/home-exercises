package advancedtest.exercise1;

public class DebitCard extends Card {


    public DebitCard(int number, String fullName, int ccv, double balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public void addMoney(double sum) {
        if (getBalance() + sum >= 10000) {
            System.out.println("Warning: too much money!");
        } else setBalance(getBalance() + sum);

    }

    @Override
    public void takeMoney(double sum) throws NotEnoughFundsException {
        if (getBalance() - sum < 0) {
           throw new NotEnoughFundsException("Not enough funds!");
        } else {
            setBalance(getBalance() - sum);
        }
    }
}
