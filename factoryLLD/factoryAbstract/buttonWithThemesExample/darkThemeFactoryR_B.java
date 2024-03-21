package buttonWithThemesExample;

public class darkThemeFactoryR_B implements factoryButton {
    public button createButton() {
        return new ButtonDark(1.5, 2.1);
    }

    public radio createRadio() {
        return new radioDark("radio2");
    }
}
