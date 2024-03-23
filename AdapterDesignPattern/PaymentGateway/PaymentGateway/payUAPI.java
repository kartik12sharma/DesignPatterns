package PaymentGateway;

public class payUAPI {
    payUAPIStatus paymentStatus = null;

    public void Pay(String userID, long amount) {
        System.out.println("Payment made via payU API");
        this.paymentStatus = payUAPIStatus.Ok;
    }

    public payUAPIStatus status() {
        return this.paymentStatus;
    }
}
