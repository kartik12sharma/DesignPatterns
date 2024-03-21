class simpleFactory{

    public static Logger createLogger(int level){    /* Abstracting the creation process and encapsulating it in another class is simple factory design pattern solely used for creating objects of similar kind*/
        if(level == 0)
            return new infoDebugger();
        if(level == 1)
            return new debugLogger();
        if(level == 2)
            return new errorLogger();
        return null;
    }
}