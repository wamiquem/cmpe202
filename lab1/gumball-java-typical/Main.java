public class Main {
    
   final static int nickle = 5;
   final static int dime = 10;
   final static int quarter = 25;
    
   public static void main(String[] args) {
       
        Machine1 machine1 = new Machine1(4);
        Machine2 machine2 = new Machine2(4);
        
        GumballMachine gumballMachine = new GumballMachine(num_of_gumballs, "machine1");
        

        System.out.println("\n"+machine1 + "-- Scenario 1: Turn crank without any coin");
        machine1.turnCrank();
        
        System.out.println("\n"+machine1 + "-- Scenario 2: Turn crank with only 1 quarter");
        machine1.insertCoin(quarter);
        machine1.turnCrank();

        System.out.println("\n"+machine1 + "-- Scenario 3: Turn crank with additional quarters");
        machine1.insertCoin(quarter);
        machine1.insertCoin(quarter);
        machine1.insertCoin(quarter);
        machine1.turnCrank();
        
        System.out.println("\n"+machine1 + "-- Scenario 4: Turn crank with no gumballs");
        machine1.insertCoin(quarter);
        machine1.turnCrank();
        machine1.insertCoin(quarter);
        machine1.turnCrank();
        machine1.insertCoin(quarter);
        machine1.turnCrank();
        
        Machine2 machine2 = new Machine2(2);

        System.out.println("\n" +machine1 + "-- Scenario 1: Turn crank without any cent");
        machine2.turnCrank();

        System.out.println(machine1 + "-- Scenario 2: Turn crank with less than 50 cents");

        machine2.insertCoin(quarter);
        machine2.turnCrank();
        machine2.insertCoin(quarter);
        machine2.insertCoin(quarter);
        machine2.turnCrank();
        machine2.insertCoin(quarter);
        machine2.insertCoin(quarter);
        machine2.turnCrank();
        System.out.println(machine2);
        
        Machine3 machine3 = new Machine3(1);

        System.out.println(machine3);

        machine3.insertCoin(nickle);
        machine3.turnCrank();

        System.out.println(machine3);
        machine3.insertCoin(quarter);
        machine3.turnCrank();
        machine3.insertCoin(quarter);
        machine3.insertCoin(quarter);
        machine3.turnCrank();
        machine3.insertCoin(quarter);
        machine3.insertCoin(dime);
        machine3.insertCoin(dime);
        machine3.insertCoin(nickle);
        machine3.turnCrank();
        System.out.println(machine3);
	}
}
