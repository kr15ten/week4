package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Parent
{
    private int amount;
    private Company job = new Company();


    public Parent(int amnt)
    {
        amount = amnt;
    }

    public double getMoney()
    {
        return job.getMoney();
    }
}
