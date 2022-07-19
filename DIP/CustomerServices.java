public class CustomerServices {

    QueryHandler queryHandler;
    CustomerServices(QueryHandler queryHandler){
        queryHandler.sendMessage("hello");
    }
}

