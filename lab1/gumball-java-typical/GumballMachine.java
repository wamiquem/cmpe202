
public class GumballMachine
{

    protected int num_gumballs;
    protected boolean has_required_amount;
    protected int total_received_amount;
    protected int remaining_amount;
    protected int required_amount;
    protected int extra_cents;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_required_amount = false;
        this.total_received_amount = 0;
        this.extra_cents = 0;
    }

    public void insertCoin(int coin){
        this.total_received_amount = this.total_received_amount + coin;
        this.remaining_amount = this.remaining_amount - coin;
    }

    public void turnCrank()
    {
        confirmRequiredAmount();
        if ( this.has_required_amount )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_required_amount = false ;
                if(this.extra_cents > 0)
                {
                    System.out.println( "Thanks for your "+this.required_amount+ "cents.  Gumball Ejected! Can't return your "+this.extra_cents +"cents." ) ;
                } 
                else
                {
                    System.out.println( "Thanks for your "+this.required_amount+ "cents.  Gumball Ejected!" ) ;
                }
                
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your "+(this.required_amount+this.extra_cents)+ " cents." ) ;
            }
        }
        else 
        {
            System.out.println( "Cannot eject the gumball. Please insert more "+this.remaining_amount +" cents" ) ;
        }        
    }
    
    public void confirmRequiredAmount(){
        if(this.total_received_amount >= this.required_amount){
            this.has_required_amount = true;
            this.extra_cents = this.total_received_amount - this.required_amount;
            this.total_received_amount = 0;
            this.remaining_amount = this.required_amount;
        }
    }
}
