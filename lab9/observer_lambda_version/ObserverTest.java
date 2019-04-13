package observer;

public class ObserverTest
{
    public void runTest()
    {
        observer.TheEconomy s = new observer.TheEconomy();
        s.attach( () -> {
        	System.out.print("Observer: Pessimist = ");
        	if ( s.getState().equalsIgnoreCase("The Price of gas is at $5.00/gal") )
            {
                System.out.println("This is the beginning of the end of the world!");
            }
            else if ( s.getState().equalsIgnoreCase( "The New iPad is out today" ) )
            {
            	System.out.println("Not another iPad!");
            }
            else
            {
            	System.out.println(":(");
            }
        });
        s.attach(() -> {
        	System.out.print("Observer: Optimist = ");
        	if ( s.getState().equalsIgnoreCase("The Price of gas is at $5.00/gal")      )
            {
        		System.out.println("Great! It's time to go green.");
            }
            else if ( s.getState().equalsIgnoreCase( "The New iPad is out today" ) )
            {
            	System.out.println("Apple, take my money!");
            }
            else
            {
            	System.out.println(":)") ;
            }
        });
        s.setState("The New iPad is out today");
        s.setState("Hey, Its Friday!");
    }
    
    public static void main( String [] args )
    {
        ObserverTest t = new ObserverTest() ;
        t.runTest() ;
    }     
    
}

