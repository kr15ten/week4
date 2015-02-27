package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Violated;

/**
 * Created by kris on 2/27/15.
 */
public abstract class Transport
{
    public Boolean getThere()
    {
        return true;
    }

    public abstract Boolean drive();
}
