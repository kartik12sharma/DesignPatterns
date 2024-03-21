package buttonExample;

class windowsButtonFactory implements buttonFactoryGenerator{

    @Override
    public button createCheckB(){
        return new checkB("windowsBtn");
    }

    @Override
    public button createSelectB(){
        return new selectB("windowsBtn");
    }
}