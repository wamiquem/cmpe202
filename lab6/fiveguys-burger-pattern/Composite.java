
import java.util.ArrayList;
public class Composite implements Component {
    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    private PrintStrategy printReceiptStrategy ;
    private PrintStrategy printPackingSlipStrategy ;
    private PrintStrategy currentStrategy ;

    public Composite ( String d )
    {
        description = d ;
        printReceiptStrategy = new PrintReceiptStrategy();
        printPackingSlipStrategy = new PrintPackingSlipStrategy();
        currentStrategy = printReceiptStrategy;
    }
    
    /** Switch to Receipt Strategy */
    public void receipt() { 
        currentStrategy = printReceiptStrategy ; 
    }

    /** Switch to Packing Slip Strategy */
    public void packingSlip()  { 
        currentStrategy = printPackingSlipStrategy ; 
    }

    public void printDescription(String tag) {
        /*
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }*/
        currentStrategy.printDescription(this);
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }

    public void removeChild(Component c) {
        components.remove(c) ;
    }

    public Component getChild(int i) {
        return components.get( i ) ;
    }

}

