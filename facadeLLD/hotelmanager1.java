public class hotelmanager1 implements manager {

    private facadeInterfaceImpl fcdobj = new facadeInterfaceImpl();

    @Override
    public void checkout() {
        fcdobj.processOrder();
    }
}
