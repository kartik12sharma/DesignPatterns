package buttonWithThemesExample;

import java.util.*;

public class mainClient {
    static factoryButton fact = null;

    public static void main(String[] ar) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Welcome to button creator/nPlease enter themeType");
        String obj = ss.nextLine();
        if (obj.toLowerCase().equals("light"))
            fact = factoryButton.chooseFactor(themeType.light);
        else if (obj.toLowerCase().equals("dark"))
            fact = factoryButton.chooseFactor(themeType.dark);
        else
            fact = null;
        ss.close();
        button btn = fact.createButton();
        btn.clickOn();
    }

}
