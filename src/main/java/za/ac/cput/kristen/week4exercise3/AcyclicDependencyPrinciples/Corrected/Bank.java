package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Bank implements IBank
{
    @Override
    public double getMoney(double amount) {
        return amount*0.15;
    }
}
