package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.DependencyInversionPrinciple.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Speak implements Words
{
    @Override
    public String getWord(String word) {
        return word;
    }
}
