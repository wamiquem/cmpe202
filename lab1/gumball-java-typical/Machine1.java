
/**
 * This gumball machine accepts only quarters and ejects gumball when it
 * has a single quarter
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Machine1 extends GumballMachine
{

    /**
     * Constructor for objects of class Machine1
     */
    private boolean accepts_only_quarter;
    public Machine1(int size)
    {
        // initialise instance variables
        super(size);
        this.num_gumballs = size;
        this.required_amount = 25;
        this.remaining_amount = this.required_amount;
        this.accepts_only_quarter = true;
    }
    
    public boolean ifAcceptsOnlyQuarter(){
        return this.accepts_only_quarter = true;
    }
}
