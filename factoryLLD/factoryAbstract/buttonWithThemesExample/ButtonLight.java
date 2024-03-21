package buttonWithThemesExample;

public class ButtonLight implements button {
    Double radius = 2.0; // default
    Double border = 1.2; // default

    public ButtonLight(Double a, Double b) {
        radius = a;
        border = b;
    }

    @Override
    public void clickOn() {
        System.out.println("Button Light theme clicked");
    }

    @Override
    public void readText() {
        System.out.println("Light themed basic button");
    }

}
