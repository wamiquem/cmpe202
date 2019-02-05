
/**
 * This gumball machine accepts only quarters and ejects gumball only
 * when it has 50 cents
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Machine2 extends GumballMachine
{
    
    /**
     * Constructor for objects of class Machine2
     */
    public Machine2(int size)
    {
        // initialise instance variables
        super(size);
        this.num_gumballs = size;
        this.required_amount = 50;
        this.remaining_amount = this.required_amount;
    }

}
