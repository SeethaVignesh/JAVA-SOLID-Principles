public class Balance implements Transactions{
    long totalAmount = 100000;

    @Override
    public void creditAmount(long amount) {
        System.out.println("Credit Amount is: " +  amount);
        System.out.println("Current Balance is: " + amount+totalAmount);
    }

    @Override
    public void debitAmount(long amount) {
        System.out.println("Credit Amount is: "+ amount);
        System.out.println("Current Balance is: " + (totalAmount - amount));
    }
}