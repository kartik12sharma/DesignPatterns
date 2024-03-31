package PaymentGateway;

public class clientMain {
    public static void main(String[] ar) {
        // Acts as the company/entity requesting service from the paymentGateway
        // using razorPayAPI for making payment
        String userID = "user11001";
        String objects = "obj1, obj2, obj3, obj4";
        double amount = 201.50;
        adapterInterfaceForPayment razorObj = new razorPayAdpInterface();
        razorObj.payMoney(userID, objects, amount);
        razorObj.returnPaymentStatus();
    }
}