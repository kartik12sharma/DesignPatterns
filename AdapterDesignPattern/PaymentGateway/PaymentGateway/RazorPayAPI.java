
package PaymentGateway;

public class RazorPayAPI {
    RazorPayStatus paymentStatus = RazorPayStatus.NotProcessed;

    public void makePayment(String userID, String objects, double amount) {
        System.out.println("Payment made via razorpay API");
        this.paymentStatus = RazorPayStatus.Success;
    }

    public RazorPayStatus checkStatus() {
        return this.paymentStatus;
    }

}
