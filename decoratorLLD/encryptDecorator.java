public class encryptDecorator extends decorator {

    public encryptDecorator(datasource nextlayer) {
        ref = nextlayer;
    }

    public void encrypt() {
        System.out.println("Encrypting data");
        writeData();

    }

    public void decrypt() {
        System.out.println("Decrypting data");
    }

    @Override
    public void readData() {
        ref.readData();
        decrypt();
        System.out.println("Reading decrypted data");
    }

    @Override
    public void writeData() {
        System.out.println("Wrting encrypted data");
        ref.writeData();
    }
}
