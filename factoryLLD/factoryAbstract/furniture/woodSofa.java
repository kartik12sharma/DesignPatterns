package furniture;

public class woodSofa implements sofa {
    String type;

    public woodSofa(String type) {
        this.type = type;
    }

    @Override
    public void typeOfSofa() {
        System.out.println(type + " type woodensofa");
    }

    @Override
    public void detailsOfSofa() {
        System.out.println("DETAILS OF SOFA PRINTED...");
    }
}
