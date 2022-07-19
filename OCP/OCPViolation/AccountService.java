public class AccountService{
    public void openAccount(){
        System.out.println("Fill account internal details");
        System.out.println("store account objects in database");
        System.out.println("updating account");
    }
    //OCP Violation
    public void aadharLinking(long number){
        System.out.println("Aadhar Number " + number + " is now linked to your account");
    }
}
