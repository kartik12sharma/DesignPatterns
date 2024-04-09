public class compressDecorator extends decorator {
    public compressDecorator(datasource nxtlyr) {
        ref = nxtlyr;
    }

    public void compress() {
        System.out.println("Compressing");
    }

    public void decompress() {
        System.out.println("Decompressing");
    }

    @Override
    public void readData() {
        ref.readData();
        decompress();
        System.out.println("Reading the decompressed data");
    }

    @Override
    public void writeData() {
        compress();
        System.out.println("Writing the compressed data");
        ref.writeData();
    }
}
