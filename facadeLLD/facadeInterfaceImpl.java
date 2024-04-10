public class facadeInterfaceImpl implements facadeinterface {

    private invoiceCreate inv = new invoiceCreate();
    private logisitics lgs = new logisitics();
    private readData rdt = new readData();

    @Override
    public void processOrder() {
        // reading data from database
        rdt.read();

        // creating invoice for order
        inv.createBill();

        // updating the database
        rdt.updateData();

        // assigning logistics
        lgs.assignLogistics();

        // send confirmation to customer
        lgs.sendConfirmation();
    }
}
