package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Walk extends Transport
{
    @Override
    public Boolean drive() throws UnsupportedOperationException
    {
        return false;
    }
}
