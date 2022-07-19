//(LSP)Liskov Substitution Principle
class LoanAccount extends AccountService {
    @Override
    public void openAccount(String name, long number) {
        super.openAccount(name, number);
        System.out.println("Your Loan Account is created");
    }
}