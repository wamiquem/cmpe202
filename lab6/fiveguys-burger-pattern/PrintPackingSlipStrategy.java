import java.util.ArrayList;

public class PrintPackingSlipStrategy implements PrintStrategy
{
    public PrintPackingSlipStrategy()
    {
        
    }

    public void printDescription(Composite Order){
         Component customBurger = Order.getChild(0); 
         Component changeOrder = customBurger.getChild(0);
         customBurger.removeChild(changeOrder);
         customBurger.addChild(changeOrder);
         
        String heading = "";
        heading+= "\n\n\n";
        heading+= "Patties - 1"+"\n";
        heading+= "\n\n\n";
        heading+= "Order Number:  45"+"\n\n";
        heading+= "          ";
        heading+= "12/1/2016   1:46:54 PM"+"\n\n";
        heading+= "           ";
        heading+= "FIVE GUYS"+"\n\n\n";
        heading+= "Sandwitch#  1"+"\n";
        System.out.println( heading );
        for (Component obj  : Order.components)
        {
            obj.printDescription("Packing Slip");
        }
    }
}
