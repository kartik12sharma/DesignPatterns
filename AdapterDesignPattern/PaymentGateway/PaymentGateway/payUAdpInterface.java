package PaymentGateway;

public class payUAdpInterface implements adapterInterfaceForPayment {
    payUAPI payU = new payUAPI();

    @Override
    public void payMoney(detailsDTO requuestObj) {
        System.out.println("Before payment is processed " + this.returnPaymentStatus());
        payU.Pay(requuestObj.userID, (long) requuestObj.amount);
        System.out.println("After payment is processed " + this.returnPaymentStatus());
    }

    @Override
    public paymentStatus returnPaymentStatus() {
        if (payU.status() == payUAPIStatus.Ok) {
            return paymentStatus.PaymentDone;
        } else if (payU.status() == payUAPIStatus.failed) {
            return paymentStatus.PaymentFailed;
        }
        return null;
    }
}
