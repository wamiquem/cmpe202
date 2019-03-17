
import java.text.DecimalFormat;

public class PrintReceiptStrategy implements PrintStrategy
{

    /**
     * Constructor for objects of class PrintReceiptStrategy
     */
    public PrintReceiptStrategy()
    {
        
    }
    
    public void printDescription(Composite Order){
        String heading = "";
        heading+= "               ";
        heading+= "FIVE GUYS"+"\n";
        heading+= "           ";
        heading+= "BURGERS AND FRIES"+"\n";
        heading+= "            ";
        heading+= "STORE # CA-1294"+"\n";
        heading+= "         ";
        heading+= "5353 ALMADEN EXPY N60"+"\n";
        heading+= "           ";
        heading+= "SAN JOSE, CA 95118"+"\n";
        heading+= "            ";
        heading+= "(P) 408-264-9300"+"\n\n\n";
        heading+= "          ";
        heading+= "12/1/2016   1:46:54 PM"+"\n\n";
        heading+= "           ";
        heading+= "FIVE GUYS"+"\n";
        heading+= "Order Number:  45";
        System.out.println( heading );
        
        for (Component obj  : Order.components)
        {
            obj.printDescription("Receipt");
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Double subTotal = 8.38;
        Component customBurger = Order.getChild(0);
        
        Double tax = 0.09 * subTotal;
        
        Double total = subTotal + tax;
        
        String tail = "";
        tail += "\n\n";
        tail += "     Sub. Total:" + "                     $"+decimalFormat.format(subTotal)+"\n";
        tail += "     Tax:       " + "                     $"+decimalFormat.format(tax)+"\n";
        tail += "     Total:     " + "                     $"+decimalFormat.format(total);
        
        System.out.println( tail );
    }
    
    

    
}
