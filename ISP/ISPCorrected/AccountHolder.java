public class AccountHolder implements AccountCredentials{
    @Override
    public void name(String name) {

        System.out.println("Account Holder: " + name);
    }
    @Override
    public void accountNumber(long number) {

        System.out.println("Account Number " + number );
    }
}
