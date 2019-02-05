
public class GumballMachine
{

    private int num_gumballs;
    private int accepted_coins[];
    private int cost;
    private boolean has_allowed_coin;
    private boolean has_required_amount;
    private int total_received_amount;
    private int remaining_amount;
    private int extra_amount;
    private String msg_accepted_coins;

    public GumballMachine( int size, int cost, int accepted_coins[], String msg_accepted_coins )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.total_received_amount = 0;
        this.extra_amount = 0;
        this.cost = cost;
        this.remaining_amount = this.cost;
        this.accepted_coins = accepted_coins;
        this.has_required_amount = false;
        this.has_allowed_coin = false;
        this.msg_accepted_coins = msg_accepted_coins;
    }

    public void insertCoin(int coin){
        for(int c : accepted_coins)
        {
            if(c == coin)
            {
                this.has_allowed_coin = true;
                break;
            }
            
        }
        
        if(this.has_allowed_coin)
        {
                this.total_received_amount = this.total_received_amount + coin;
                this.remaining_amount = this.remaining_amount - coin;
                this.has_allowed_coin = false;
        }
        else
        {
                System.out.println(msg_accepted_coins);
        }
        
        if(this.total_received_amount >= this.cost)
        {
            this.has_required_amount = true;
            this.extra_amount = this.total_received_amount - this.cost;
            this.remaining_amount = this.cost;
        }
    }

    public void turnCrank()
    {
        if ( this.has_required_amount )
        {
            this.has_required_amount = false;
            
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.total_received_amount = 0;
                if(this.extra_amount > 0)
                {
                    System.out.println( "Thanks for your "+this.cost+ "cents.  Gumball Ejected! Can't return your "+this.extra_amount +"cents." ) ;
                    this.extra_amount = 0;
                } 
                else
                {
                    System.out.println( "Thanks for your "+this.cost+ "cents.  Gumball Ejected!" ) ;
                }
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your "+this.total_received_amount + " cents." ) ;
                this.total_received_amount = 0;
            }
        }
        else 
        {
            System.out.println( "Cannot eject the gumball. Please insert more "+this.remaining_amount +" cents" ) ;
        }        
    }
}
