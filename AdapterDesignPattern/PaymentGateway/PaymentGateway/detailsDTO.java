package PaymentGateway;

public class detailsDTO {
    String userID;
    String objects;
    double amount;

    public detailsDTO(String a, String b, double c) {
        userID = a;
        objects = b;
        amount = c;
    }

}
