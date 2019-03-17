 

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
    }
    
    public void printDescription(String tag) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String desc = "";
        if(tag.toLowerCase().equals("receipt")) {
            desc = "1    " + description + "                         " +price;
        }
        else {
            desc = "1    " + description;
        }
        
        System.out.println( desc) ;
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
	
	public void receipt() {
        // no implementation
	}
	
	public void packingSlip() {
        // no implementation
	}
	 
}
 
