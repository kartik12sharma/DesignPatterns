package loggerExample;

public class classMain{
    public static void main(String[] ar){
        factory infoFact = new infoLoggerFactory();
        logger infoLog = infoFact.create();
        infoLog.log();
    }
}