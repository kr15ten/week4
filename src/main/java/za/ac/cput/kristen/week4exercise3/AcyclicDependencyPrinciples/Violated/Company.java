package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Company
{
    private Government buy = new Government();

    public double getMoney()
    {
        return buy.getMoney();
    }
}
