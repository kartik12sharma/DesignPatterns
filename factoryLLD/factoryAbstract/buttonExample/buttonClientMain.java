package buttonExample;

public class buttonClientMain {
    public static void main(String[] ar){
        buttonFactoryGenerator bFact = buttonFactoryGenerator.selectFactory(1);
        button winBtn = bFact.createCheckB();
        button winBtn1 = bFact.createSelectB();
        buttonFactoryGenerator bFact1 = buttonFactoryGenerator.selectFactory(2);
        button macBtn = bFact1.createCheckB();
        button macBtn1 = bFact1.createSelectB();
        winBtn.display();
        winBtn1.display();
        macBtn.display();
        macBtn1.display();
    }
}
