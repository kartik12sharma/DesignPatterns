package buttonWithThemesExample;

class radioLight implements radio {
    public String text = "DEFAULT :: LightRadio";
    public boolean isSelected;

    public radioLight(String title) {
        text = title;
    }

    @Override
    public void select() {
        System.out.println("Selected light radio button");
        isSelected = true;
    }

    @Override
    public void readText() {
        System.out.println("text is " + text);
    }
}