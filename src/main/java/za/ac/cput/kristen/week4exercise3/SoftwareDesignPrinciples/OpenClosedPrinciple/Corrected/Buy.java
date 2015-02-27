package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Buy implements IBuy
{
    @Override
    public double buySomething(String thing)
    {
        if (thing == "cat")
            return 5.16;

        else if (thing == "dog")
            return 10.16;

        else if (thing == "catfood")
            return 10.0;

        else
            return 5.0;
    }
}
