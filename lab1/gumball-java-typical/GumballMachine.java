
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
        total_received_amount = 0;
        extra_amount = 0;
        this.cost = cost;
        remaining_amount = this.cost;
        this.accepted_coins = accepted_coins;
        has_required_amount = false;
        has_allowed_coin = false;
        this.msg_accepted_coins = msg_accepted_coins;
    }

    public void insertCoin(int coin){
        for(int c : accepted_coins)
        {
            if(c == coin)
            {
                has_allowed_coin = true;
                break;
            }
            
        }
        
        if(has_allowed_coin)
        {
                total_received_amount = total_received_amount + coin;
                remaining_amount = remaining_amount - coin;
                has_allowed_coin = false;
        }
        else
        {
                System.out.println(msg_accepted_coins + ". Sorry, can't return your "+coin+" cents.");
        }
        
        if(total_received_amount >= cost)
        {
            has_required_amount = true;
            extra_amount = total_received_amount - cost;
            remaining_amount = cost;
        }
    }

    public void turnCrank()
    {
        if ( has_required_amount )
        {
            has_required_amount = false;
            
            if ( num_gumballs > 0 )
            {
                num_gumballs-- ;
                total_received_amount = 0;
                if(extra_amount > 0)
                {
                    System.out.println( "Thanks for your "+cost+ "cents.  Gumball Ejected! Can't return your "+extra_amount +"cents." ) ;
                    extra_amount = 0;
                } 
                else
                {
                    System.out.println( "Thanks for your "+cost+ "cents.  Gumball Ejected!" ) ;
                }
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your "+total_received_amount + " cents." ) ;
                total_received_amount = 0;
            }
        }
        else 
        {
            System.out.println( "Cannot eject the gumball. Please insert more "+remaining_amount +" cents" ) ;
        }        
    }
}
