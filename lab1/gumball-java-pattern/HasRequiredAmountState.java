
import java.util.Random;
public class HasRequiredAmountState implements State {
    GumballMachine gumballMachine;

    public HasRequiredAmountState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You can't insert more coin. Already have required amount");
    }

    public void ejectCoin() {
        System.out.println("Coin returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
