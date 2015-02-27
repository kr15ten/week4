package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Car extends Transport
{
    @Override
    public Boolean getsThere()
    {
        return true;
    }

    @Override
    public Boolean drive()
    {
        return true;
    }
}
