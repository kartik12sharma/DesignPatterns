package furniture;

public class furnitureMain {
    public static void main(String[] ar) {
        factoryFurniture modernFact = factoryFurniture.selectFactory(2);
        sofa modernSofa = modernFact.createFurnitureFactorySofa();
        modernSofa.typeOfSofa();
        chair modernChair = modernFact.createFurnitureFactoryChair();
        modernChair.typeOfChair();
        modernChair.detailsOfChair();
    }
}
