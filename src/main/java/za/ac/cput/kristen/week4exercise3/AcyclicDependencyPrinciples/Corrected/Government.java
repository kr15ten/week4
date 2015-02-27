package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Government
{
    private Company tax = new Company();

    public double getMoney()
    {
        return tax.getMoney(1500);
    }
}
