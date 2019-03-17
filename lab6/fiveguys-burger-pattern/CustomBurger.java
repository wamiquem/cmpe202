
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    protected Double price;
    public CustomBurger ( String d , Double p)
    {
        super(d) ;
        price = p;
    }
    
    
    public void printDescription(String tag) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String desc = "";
        if(tag.toLowerCase().equals("receipt")) {
            desc = "1     " + description + "                            " +price;
        }
        else {
            desc = "1    " + description;
        }

        System.out.println( desc);
        for (Component obj  : components)
        {
            obj.printDescription(tag);
        }
    }
}

       