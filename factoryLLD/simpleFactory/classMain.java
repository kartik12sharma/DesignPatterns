public class classMain {
    public static void main(String[] ar){
        /*The client here only deals with factory that creates different types of loggers and not the 
         * different types of loggers itself. (SimpleFactory)
         */
        Logger infoLog = simpleFactory.createLogger(0);
        Logger debugLog = simpleFactory.createLogger(1);
        Logger errorLog = simpleFactory.createLogger(2);
        
        infoLog.log();
        System.out.println(" log level saved");
        debugLog.log();
        System.out.println(" log level saved");
        errorLog.log();
        System.out.println(" log level saved");
    }
}
