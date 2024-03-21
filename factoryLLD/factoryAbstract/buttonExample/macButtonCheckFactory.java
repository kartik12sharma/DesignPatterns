package buttonExample;

class macButtonCheckFactory implements buttonFactoryGenerator{
    
    @Override
    public button createCheckB(){
        return new checkB("Mac button");
    }

    @Override
    public button createSelectB(){
        return new selectB("Mac button");
    }
}
