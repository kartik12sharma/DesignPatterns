package loggerExample;

public class infoLoggerFactory implements factory {
    public logger create(){
        return new infoLogger();
    }
}
