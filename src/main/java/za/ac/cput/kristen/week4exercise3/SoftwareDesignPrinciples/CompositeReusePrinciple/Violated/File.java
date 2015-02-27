package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.CompositeReusePrinciple.Violated;

/**
 * Created by kris on 2/27/15.
 */
public abstract class File
{
    Boolean hasSpace() {
        return true;
    }

    Boolean canOpen()
    {
        return true;
    }

    public abstract Boolean containsWords();
}
