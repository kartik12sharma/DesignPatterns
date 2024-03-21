package furniture;

class modernFactoryFurniture implements factoryFurniture {
    String type = "modern";

    @Override
    public chair createFurnitureFactoryChair() {
        return new woodChair(type);
    }

    public sofa createFurnitureFactorySofa() {
        return new woodSofa(type);
    }
}