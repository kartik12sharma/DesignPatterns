package buttonWithThemesExample;

class radioDark implements radio {
    public String text = "DEFAULT :: DarkRadio";
    public boolean isSelected;

    public radioDark(String title) {
        text = title;
    }

    @Override
    public void select() {
        System.out.println("Selected dark radio button");
        isSelected = true;
    }

    @Override
    public void readText() {
        System.out.println("text is " + text);
    }
}