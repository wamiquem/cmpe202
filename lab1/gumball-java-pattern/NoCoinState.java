
public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        gumballMachine.checkCoin(coin);
        if(gumballMachine.getHasAllowedCoin()) {
            System.out.println("You inserted an allowed coin");
            gumballMachine.hasAllowedCoin = false;
            gumballMachine.addAmount(coin);
            gumballMachine.checkRequiredAmount();
            if(gumballMachine.getHasRequiredAmount()) {
                gumballMachine.totalInsertedAmount = 0;
                gumballMachine.remainingAmount = gumballMachine.totalRequiredAmount;
                gumballMachine.setState(gumballMachine.getHasRequiredAmountState());
            }
            else {
                gumballMachine.setState(gumballMachine.getHasNoRequiredAmountState());
            }
        }
        else {
            System.out.println("Not an allowed coin.Sorry, can't return your coin.");
        }
        
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted any coin");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
    }

    public void dispense() {
        System.out.println("You need to pay first. There is no coin");
    } 

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("waiting for "+gumballMachine.cost+" cents. ");
        result.append("Allowed coins - only "+gumballMachine.allowedCoins);
        return result.toString();
    }
}
