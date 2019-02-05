
/**
 * This gumball machine accepts only nickles, dimes and quarters and
 * ejects gumball only when it has 50 cents
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Machine3 extends GumballMachine
{
    
    /**
     * Constructor for objects of class Machine3
     */
    public Machine3(int size)
    {
        // initialise instance variables
        super(size);
        this.num_gumballs = size;
        this.required_amount = 50;
        this.remaining_amount = this.required_amount;
    }

}
