//LSP Violation
public class LoanAccount extends AccountService{

    long totalBalance = 100000;
    public void openAccount(){
        System.out.println("Fill the credentials for creating your loan account");
    }

    public void aadharLinking(long number){
        System.out.println("Your Aadhar Number " + number + " is now linked to your loan account");
    }

    public void withdrawLoanAmount(long amount){
        System.out.println("Your balance is debited with: " + amount + "from your loan account and current balance is: " + (totalBalance-amount));
    }
}