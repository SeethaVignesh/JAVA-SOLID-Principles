public class CustomerQuery implements QueryHandler {
    @Override
    public void sendMessage(String query) {
        System.out.println("your query: " + query + " is resolved");
    }
}