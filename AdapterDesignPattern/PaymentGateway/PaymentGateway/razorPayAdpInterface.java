package PaymentGateway;

public class razorPayAdpInterface implements adapterInterfaceForPayment {
    RazorPayAPI razorAPI = new RazorPayAPI();

    @Override
    public void payMoney(String userID, String objects, double amount) {
        System.out.println("Payment status before processing " + this.returnPaymentStatus());
        razorAPI.makePayment(userID, objects, amount);
        razorAPI.paymentStatus = RazorPayStatus.Success;
        System.out.println("Payment status after processing " + this.returnPaymentStatus());
    }

    public paymentStatus returnPaymentStatus() {
        if (razorAPI.checkStatus() == RazorPayStatus.Success)
            return paymentStatus.PaymentDone;
        else if (razorAPI.checkStatus() == RazorPayStatus.Failure)
            return paymentStatus.PaymentFailed;
        return null;
    }
}
