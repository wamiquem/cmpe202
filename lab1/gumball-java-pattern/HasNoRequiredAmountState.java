
import java.util.Random;
public class HasNoRequiredAmountState implements State {
    GumballMachine gumballMachine;

    public HasNoRequiredAmountState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        gumballMachine.checkCoin(coin);
        if(gumballMachine.getIsAllowedCoin()) {
            System.out.println("You inserted an allowed coin");
            gumballMachine.setIsAllowedCoin(false);
            gumballMachine.addAmount(coin);
            gumballMachine.checkRequiredAmount();
            if(gumballMachine.getHasRequiredAmount()) {
                gumballMachine.setTotalInsertedAmount(0);
                gumballMachine.setHasRequiredAmount(false);
                gumballMachine.SetRemainingAmount();
                gumballMachine.setState(gumballMachine.getHasRequiredAmountState());
            }
        }
        else {
            System.out.println("Not an allowed coin.Sorry, can't return your coin.");
        }
    }

    public void ejectCoin() {
        System.out.println("Coins returned. Total return value - "+gumballMachine.totalInsertedAmount);
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("You turned, but more "+gumballMachine.remainingAmount+" cents are needed");
    }

    public void dispense() {
        System.out.println("You need to pay more "+gumballMachine.remainingAmount+" cents");
    }

    public String toString() {
        return "waiting for more "+gumballMachine.remainingAmount+" cents";
    }
}
