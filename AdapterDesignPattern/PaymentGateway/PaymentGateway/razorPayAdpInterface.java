package PaymentGateway;

public class razorPayAdpInterface implements adapterInterfaceForPayment {
    RazorPayAPI razorAPI = new RazorPayAPI();

    @Override
    public void payMoney(detailsDTO requuestObj) {
        System.out.println("Payment status before processing " + this.returnPaymentStatus());
        razorAPI.prePay(requuestObj.userID, requuestObj.objects, requuestObj.amount);
        razorAPI.makePayment(requuestObj.userID, requuestObj.objects, requuestObj.amount);
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
