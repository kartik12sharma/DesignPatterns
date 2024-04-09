public abstract class decorator implements datasource {
    datasource ref;

    abstract public void readData();

    abstract public void writeData();
}
