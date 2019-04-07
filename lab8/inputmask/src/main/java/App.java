/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

	private Screen screen;
	private IDisplayComponent num;
	private IDisplayComponent exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CardNumDecorator(new CreditCardNum());
        exp = new CardExpDecorator(new CreditCardExp());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(ch.matches("[0-9]") || ch.equalsIgnoreCase("x")) {
    		if(ch.equalsIgnoreCase("x")) {
    			if(count>0)
    				count--;
    		}
    		else {
    			if(count<23)
    				count++;
    		}
    		if(count<23)		
    			screen.key(ch, count);
    	}
    		
    }

}

