public class Main {
    private static String msg_accepted_coins = null;
    
    public static void main(String[] args) {
        msg_accepted_coins = "Accepts only nickles, dimes and quarters";
        //gumball_machine1 costs 50 cents, can accept nickle, dime or quarter and has 2 gumballs
        GumballMachine gumball_machine1 = new GumballMachine(2,50,new int[]{5,10,25},msg_accepted_coins);
        System.out.println(gumball_machine1);
        //Can't eject gumball as no coin. Also displays the remaining cents needed to eject
        gumball_machine1.turnCrank();    
        gumball_machine1.insertCoin(5);
        //Can't eject as total amount is less than 50 cents. Also displays the remaining cents needed to eject
        gumball_machine1.turnCrank();
        //Can't accept a cent coin
        gumball_machine1.insertCoin(1);  
        //Still can't eject as total amount is less than 50 cents. Also displays the remaining cents needed to eject
        gumball_machine1.turnCrank();
        gumball_machine1.insertCoin(10);
        //Still can't eject as total amount is less than 50 cents. Also displays the remaining cents needed to eject
        gumball_machine1.turnCrank();    
        gumball_machine1.insertCoin(25);
        //Still can't eject as total amount is less than 50 cents. Also displays the remaining cents needed to eject
        gumball_machine1.turnCrank();
        gumball_machine1.insertCoin(25);
        //Gumball ejected as total amount is more than 50 cents. Also displays the extra cents which cannot be returned
        gumball_machine1.turnCrank();     
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.insertCoin(25);
        //Gumball ejected as total amount is 50 cents
        gumball_machine1.turnCrank();    
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.insertCoin(5);
        gumball_machine1.insertCoin(5);
        gumball_machine1.insertCoin(5);
        gumball_machine1.insertCoin(10);
        //Gumball not ejected even when total amount is 50 cents as no more gumball left
        gumball_machine1.turnCrank();    
        
        gumball_machine1.insertCoin(25);
        //Can't eject as total amount is not 50 cents
        gumball_machine1.turnCrank();    
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.insertCoin(5);
        //Gumball not ejected even when total amount is 50 cents as no more gumball left.
        //Also, displays the total amount which won't be returned(55 cents)
        gumball_machine1.turnCrank();    
        
        msg_accepted_coins = "Accepts only quarters";
        //gumball_machine2 costs 50 cents, can accept only quarter and has 3 gumballs
        GumballMachine gumball_machine2 = new GumballMachine(3,50,new int[]{25}, msg_accepted_coins);
        System.out.println("\n"+gumball_machine2);
        //Can't accept a nickle coin
        gumball_machine2.insertCoin(5);
        //Can't eject gumball as no coin. Also displays the remaining cents needed to eject
        gumball_machine2.turnCrank();
        gumball_machine2.insertCoin(25);
        //Can't eject as total amount is less than 50 cents. Also displays the remaining cents needed to eject
        gumball_machine2.turnCrank();
        //Can't accept a dime coin
        gumball_machine2.insertCoin(10);
        //Can't eject as total amount is less than 50 cents. Also displays the remaining cents needed to eject
        gumball_machine2.turnCrank();
        gumball_machine2.insertCoin(25);
        //Gumball ejected as total amount is 50 cents
        gumball_machine2.turnCrank();
        
        gumball_machine2.insertCoin(25);
        gumball_machine2.insertCoin(25);
        gumball_machine2.insertCoin(25);
        //Gumball ejected as total amount is more than 50 cents. Also displays the extra cents which cannot be returned
        gumball_machine2.turnCrank();
        
        gumball_machine2.insertCoin(25);
        gumball_machine2.insertCoin(25);
        //Gumball ejected as total amount is 50 cents
        gumball_machine2.turnCrank();
        
        gumball_machine2.insertCoin(25);
        gumball_machine2.insertCoin(25);
        //Gumball not ejected even when total amount is 50 cents as no more gumball left.
        //Also, displays the total amount which won't be returned(50 cents)
        gumball_machine2.turnCrank();
        
        //gumball_machine3 costs 25 cents, can accept only quarter and has 4 gumballs
        GumballMachine gumball_machine3 = new GumballMachine(4,25,new int[]{25}, msg_accepted_coins);
        System.out.println("\n"+gumball_machine2);
        //Can't accept a nickle coin
        gumball_machine3.insertCoin(5);
        //Can't eject gumball as no coin. Also displays the remaining cents needed to eject
        gumball_machine3.turnCrank();
        gumball_machine3.insertCoin(25);
        gumball_machine3.insertCoin(25);
        //Gumball ejected as total amount is more than 25 cents. Also displays the extra cents which cannot be returned
        gumball_machine3.turnCrank();
        
        gumball_machine3.insertCoin(25);
        //Gumball ejected as total amount is 25 cents
        gumball_machine3.turnCrank();
        
        gumball_machine3.insertCoin(25);
        //Gumball ejected as total amount is 25 cents
        gumball_machine3.turnCrank();
        
        gumball_machine3.insertCoin(25);
        //Gumball ejected as total amount is 25 cents
        gumball_machine3.turnCrank();
        
        gumball_machine3.insertCoin(25);
        //Gumball not ejected even when total amount is 25 cents as no more gumball left.
        //Also, displays the total amount which won't be returned(25 cents)
        gumball_machine3.turnCrank();
        
        gumball_machine3.insertCoin(25);
        gumball_machine3.insertCoin(25);
        //Gumball not ejected even when total amount is 50 cents(more than 25) as no more gumball left.
        //Also, displays the total amount which won't be returned(50 cents)
        gumball_machine3.turnCrank();
        
        
    }
}
