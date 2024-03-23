package PaymentGateway;

interface adapterInterfaceForPayment {
    public void payMoney(String userID, String objects, double amount);

    public paymentStatus returnPaymentStatus();
}
