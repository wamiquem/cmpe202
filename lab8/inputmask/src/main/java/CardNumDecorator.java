/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CardNumDecorator implements IDisplayComponent, IKeyEventHandler
{

	private String addedState ;	
	private IDisplayComponent component ;
	private String number = "";
	
	public CardNumDecorator(IDisplayComponent component) {
		this.component = component;
	}

	public String display() {
		addedState = component.display();
		return addedBehavior(addedState);
	}	

	private String addedBehavior(String in) {
		String decoratedString = new String();
		int stringLength = in.length();
		String numberOnly = in.replace("[", "").replace("]", "").trim();
		int numberLength = numberOnly.length();
		if ( number.equals("") )
			decoratedString = "[4444 4444 4444 4444]" + "  " ;
		else {
			for (int i = 0; i < stringLength; i++) {
				decoratedString += in.charAt(i);
				
				if((i==4 && numberLength>4) || (i==8 && numberLength>8) || (i==12 && numberLength>12))
					decoratedString += " "; 
			}
		}
		
		
		return decoratedString;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public void key(String ch, int cnt) {
		number += ch ;
		((CreditCardNum)component).key(ch, cnt);
	}
	
	public void setNext( IKeyEventHandler next) {
		((CreditCardNum)component).setNext(next);
    }

}