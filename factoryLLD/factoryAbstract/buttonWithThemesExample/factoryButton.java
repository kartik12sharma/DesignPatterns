package buttonWithThemesExample;

interface factoryButton {
    public button createButton();

    public radio createRadio();

    public static factoryButton chooseFactor(themeType theme) {
        if (theme == themeType.light) {
            return new lightThemeFactoryR_B();
        } else if (theme == themeType.dark) {
            return new darkThemeFactoryR_B();
        }
        return null;
    }

}
