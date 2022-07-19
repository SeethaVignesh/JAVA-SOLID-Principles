//this violates the Single responsibility principles
class AccountService {
    public void openAccount() {
        System.out.println("Fill Account Details");
    }
    public void storeAccount() {
        System.out.println("Store the account obj in Database");
    }
    public void updateAccount() {
        System.out.println("update the account obj in Database");
    }
}



