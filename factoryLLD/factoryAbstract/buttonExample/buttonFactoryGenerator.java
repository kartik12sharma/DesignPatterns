package buttonExample;

interface buttonFactoryGenerator {
    public button createCheckB();
    public button createSelectB();

    public static buttonFactoryGenerator selectFactory(int type){
        if(type == 1)
            return new windowsButtonFactory();
        else if(type == 2)
            return new macButtonCheckFactory();
        return null;
    }
}
