package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Lecturer implements Person
{
    @Override
    public Boolean lectures()
    {
        return true;
    }

    @Override
    public Boolean studies()
    {
        return false;
    }
}
