package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Government
{
    Parent taxpayer = new Parent(1500);

    public double getMoney()
    {
        return taxpayer.getMoney();
    }
}
