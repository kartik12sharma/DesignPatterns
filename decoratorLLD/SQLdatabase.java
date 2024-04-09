public class SQLdatabase implements datasource {
    @Override
    public void readData() {
        System.out.println("Reading from database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing to database");
    }
}
