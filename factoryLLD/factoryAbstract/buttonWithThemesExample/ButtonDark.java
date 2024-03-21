package buttonWithThemesExample;

public class ButtonDark implements button {
    Double radius = 2.0; // default
    Double border = 1.2; // default

    public ButtonDark(Double a, Double b) {
        radius = a;
        border = b;
    }

    @Override
    public void clickOn() {
        System.out.println("Button Dark theme clicked");
    }

    @Override
    public void readText() {
        System.out.println("Dark themed basic button");
    }

}
