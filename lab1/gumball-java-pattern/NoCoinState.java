
public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        gumballMachine.checkCoin(coin);
        if(gumballMachine.getHasAllowedCoin()) {
            gumballMachine.addAmount(coin);
            if(gumballMachine.getHasRequiredAmount()) {
                gumballMachine.setState(gumballMachine.getHasRequiredAmountState());
            }
            else {
                gumballMachine.setState(gumballMachine.getHasNoRequiredAmountState());
            }
        }
        else {
            System.out.println("You inserted an invalid coin. "+gumballMachine.msgAcceptedCoins);
            System.out.println("Sorry, can't return your coin. ");
        }
        
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    } 

    public String toString() {
        return "waiting for quarter";
    }
}
