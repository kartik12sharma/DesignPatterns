package buttonWithThemesExample;

public class lightThemeFactoryR_B implements factoryButton {
    public button createButton() {
        return new ButtonLight(1.3, 2.0);
    }

    public radio createRadio() {
        return new radioLight("radio1");
    }
}
