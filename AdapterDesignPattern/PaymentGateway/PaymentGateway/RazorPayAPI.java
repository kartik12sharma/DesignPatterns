
package PaymentGateway;

public class RazorPayAPI {
    RazorPayStatus paymentStatus = RazorPayStatus.NotProcessed;

    public void prePay(String userID, String objects, double amount) {
        System.out.println("A new method prepay added to the RazorPayAPI.");
    }

    public void makePayment(String userID, String objects, double amount) {
        System.out.println("Payment made via razorpay API");
        this.paymentStatus = RazorPayStatus.Success;
    }

    public RazorPayStatus checkStatus() {
        return this.paymentStatus;
    }

}
