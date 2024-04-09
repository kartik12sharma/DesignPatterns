public class nMain {
    public static void main(String[] ar) {
        datasource nextlyr = new SQLdatabase();
        datasource nxtlayer = new compressDecorator(nextlyr);
        encryptDecorator dtr = new encryptDecorator(nxtlayer);
        dtr.writeData();
        System.out.println("\n\n");
        dtr.readData();
    }
}
