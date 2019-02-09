
public class Main {
    private static String allowedCoins = null;

    public static void main(String[] args) {
        allowedCoins = "nickles, dimes and quarters";
        //gumballMachine1 costs 50 cents, can accept nickle, dime or quarter and has 2 gumballs
        GumballMachine gumballMachine1 = new GumballMachine(2, 50, new int[]{5,10,25}, allowedCoins);

        System.out.println(gumballMachine1);
        //gumballMachine1 is in NoCoinState. Turning the crank will not dispense gumball and gives proper message
        gumballMachine1.turnCrank();
        //a cent coin is not allowed, proper message is thrown. gumballMachine1 is still in NoCoinState
        gumballMachine1.insertCoin(1);
        //Turning the crank will not dispense gumball and gives proper message
        gumballMachine1.turnCrank();
        //Allowed coin(quarter) is inserted, proper message is thrown. New state is HasNoRequiredAmountState
        gumballMachine1.insertCoin(25);
        //Turning the crank will not dispense gumball and gives proper message
        gumballMachine1.turnCrank();
        //Allowed coin(nickle) is inserted, proper message is thrown. State is still HasNoRequiredAmountState
        gumballMachine1.insertCoin(5);
        //Allowed coin(quarter) is inserted, proper message is thrown. New state is HasRequiredAmountState
        gumballMachine1.insertCoin(25);
        //Turning the crank will now dispense the gumball. Machine is in NoCoinState with 1 gumball remaining 
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1);

        //Allowed coin(quarter) is inserted, proper message is thrown. New state is HasNoRequiredAmountState
        gumballMachine1.insertCoin(25);
        //Allowed coin(quarter) is inserted, proper message is thrown. New state is HasRequiredAmountState
        gumballMachine1.insertCoin(25);
        //Turning the crank will now dispense the gumball. Machine is in SoldOutState as no gumball is remaining
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1);

        //Allowed coin(quarter) is inserted but cannot insert coins in SoldOutState, gives proper message
        gumballMachine1.insertCoin(5);

        allowedCoins = "quarters";
        //gumballMachine1 costs 50 cents, can accept quarter and has 1 gumball
        GumballMachine gumballMachine2 = new GumballMachine(2, 50, new int[]{25}, allowedCoins);

        System.out.println(gumballMachine2);
        gumballMachine2.insertCoin(10);
        gumballMachine2.insertCoin(25);
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(25);
        System.out.println(gumballMachine2);
        
        //gumballMachine1 costs 50 cents, can accept quarter and has 1 gumball
        GumballMachine gumballMachine3 = new GumballMachine(1, 25, new int[]{25}, allowedCoins);

        System.out.println(gumballMachine3);
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(25);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(25);
        System.out.println(gumballMachine3);
    }
}
