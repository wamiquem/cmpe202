/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CardExpDecorator implements IDisplayComponent, IKeyEventHandler
{

	private String addedState ;	
	private IDisplayComponent component ;
	
	public CardExpDecorator(IDisplayComponent component) {
		this.component = component;
	}

	public String display() {
		addedState = component.display();
		return addedBehavior(addedState);
	}	

	private String addedBehavior(String in) {
		String decoratedString = new String();
		int stringLength = in.length();
		String dateOnly = in.replace("[", "").replace("]", "").trim();
		int dateLength = dateOnly.length();
		String defaultExp = "[MM/YY]" + "  " ;
		
//		if ( date.equals("") )
//			decoratedString = "[MM/YY]" + "  " ;
//		else {
//			for (int i = 0; i < stringLength; i++) {
//				decoratedString += in.charAt(i);
//				
//				if((i==2 && dateLength>2))
//					decoratedString += "/"; 
//			}
//		}
		
		if(!in.equals(defaultExp)) {
			for (int i = 0; i < stringLength; i++) {
				decoratedString += in.charAt(i);
				
				if((i==2 && dateLength>2))
					decoratedString += "/"; 
			}
		}
		else
			decoratedString = in;
		
		return decoratedString;
	}
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public void key(String ch, int cnt) {
		((CreditCardExp)component).key(ch, cnt);
	}
	
	public void setNext( IKeyEventHandler next) {
		((CreditCardExp)component).setNext(next);
    }

}