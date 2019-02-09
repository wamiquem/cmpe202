
public class GumballMachine {
    State soldOutState;
    State noCoinState;
    State hasRequiredAmountState;
    State hasNoRequiredAmountState;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int cost;
    int allowedCoinsValues[];
    String allowedCoins;
    boolean hasAllowedCoin;
    int totalInsertedAmount;
    boolean hasRequiredAmount;
    int totalRequiredAmount;
    int remainingAmount;

    public GumballMachine(int numberGumballs, int cost, int allowedCoinsValues[], String allowedCoins) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasRequiredAmountState = new HasRequiredAmountState(this);
        hasNoRequiredAmountState = new HasNoRequiredAmountState(this);
        soldState = new SoldState(this);
        
        this.cost = cost;
        this.allowedCoinsValues = allowedCoinsValues;
        this.allowedCoins = allowedCoins;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
        
        hasAllowedCoin = false;
        totalInsertedAmount = 0;
        hasRequiredAmount = false;
        totalRequiredAmount = this.cost;
        remainingAmount = totalRequiredAmount;
    }

    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    void checkCoin(int coin) {
        System.out.println("Checking if a valid coin is inserted...");
        for(int c : allowedCoinsValues)
        {
            if(c == coin)
            {
                hasAllowedCoin = true;
                break;
            }
            
        }
    }
    
    public boolean getHasAllowedCoin() {
        return hasAllowedCoin;
    }
    
    void addAmount(int coin) {
        totalInsertedAmount = totalInsertedAmount + coin;
        remainingAmount = remainingAmount - coin;
    }
    
    void checkRequiredAmount() {
        if(totalInsertedAmount >= cost){
            hasRequiredAmount = true;
        }
    }
    
    public boolean getHasRequiredAmount() {
        return hasRequiredAmount;
    }
    
    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasRequiredAmountState() {
        return hasRequiredAmountState;
    }
    
    public State getHasNoRequiredAmountState() {
        return hasNoRequiredAmountState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        result.append("Please insert exact value, extra change would not be returned if a gumball is ejected. \n");
        return result.toString();
    }
}
