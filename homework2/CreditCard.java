public class CreditCard {
    public CreditCard(int cust, int bk, int acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }


    public boolean charge(double price) { // make a charge
        if (price + balance > limit) // if charge would surpass limit
            return false; // refuse the charge
        balance += price; // update the balance
        return true; // announce the good news
    }


    public void makePayment(double amount) {
        if (amount < 0) {
            throw new IllegalargumentException("Negative Amount is not Allowed");
            balance -= amount;
        }
    }
}
