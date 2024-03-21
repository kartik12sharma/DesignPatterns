package furniture;

interface factoryFurniture {
    public chair createFurnitureFactoryChair();

    public sofa createFurnitureFactorySofa();

    public static factoryFurniture selectFactory(int val) {
        if (val == 1)
            return new traditionalFactoryFurniture();
        else if (val == 2)
            return new modernFactoryFurniture();
        return null;
    }
}
