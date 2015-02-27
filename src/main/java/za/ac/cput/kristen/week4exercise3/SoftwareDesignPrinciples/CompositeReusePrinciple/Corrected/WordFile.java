package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.CompositeReusePrinciple.Corrected;


/**
 * Created by kris on 2/27/15.
 */
public class WordFile
{
    private File file = new File();

    public String containsWords()
    {
        return file.getContains("words");
    }
}
