/*
 * This class has a method named checkout which is a monster function as it has a lot of dependencies and
 * all those methods are called from a single method.
 */
public class hotemanager implements manager {
    private invoiceCreate inv = new invoiceCreate();
    private logisitics lgs = new logisitics();
    private readData rdt = new readData();

    @Override
    public void checkout() {
        // Several complex steps need to be executed.

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
