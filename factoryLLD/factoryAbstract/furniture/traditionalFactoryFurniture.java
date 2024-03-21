package furniture;

class traditionalFactoryFurniture implements factoryFurniture {
    String type = "traditional";

    @Override
    public chair createFurnitureFactoryChair() {
        return new woodChair(type);
    }

    public sofa createFurnitureFactorySofa() {
        return new woodSofa(type);
    }
}