package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Company
{
    private IBank money = new Bank();

    public double getMoney(double amount)
    {
        return money.getMoney(amount);
    }
}
