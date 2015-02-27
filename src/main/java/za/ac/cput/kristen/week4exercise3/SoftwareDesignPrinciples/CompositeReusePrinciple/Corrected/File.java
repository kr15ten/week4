package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.CompositeReusePrinciple.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class File
{
    Boolean hasSpace() {
        return true;
    }

    Boolean canOpen()
    {
        return true;
    }

    public String getContains(String contains)
    {
        return contains;
    }
}
