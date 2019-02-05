public class Main {
    
    public static void main(String[] args) {
        GumballMachine gumball_machine1 = new GumballMachine(2,50,new int[]{5,10,25});

        System.out.println(gumball_machine1);

        gumball_machine1.insertCoin(5);
        gumball_machine1.turnCrank();
        gumball_machine1.insertCoin(1);
        gumball_machine1.turnCrank();
        gumball_machine1.insertCoin(10);
        gumball_machine1.turnCrank();
        gumball_machine1.insertCoin(25);
        gumball_machine1.turnCrank();
        gumball_machine1.insertCoin(25);
        gumball_machine1.turnCrank();
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.insertCoin(25);
        gumball_machine1.turnCrank();
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.insertCoin(5);
        gumball_machine1.insertCoin(5);
        gumball_machine1.insertCoin(5);
        gumball_machine1.insertCoin(10);
        gumball_machine1.turnCrank();
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.turnCrank();
        
        gumball_machine1.insertCoin(25);
        gumball_machine1.turnCrank();

        /*System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);*/
        
    }
}
