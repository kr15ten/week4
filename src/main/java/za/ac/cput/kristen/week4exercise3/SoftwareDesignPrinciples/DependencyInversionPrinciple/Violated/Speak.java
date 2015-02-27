package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.DependencyInversionPrinciple.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Speak
{
    private Words word = new Words();

    public String getWord()
    {
        return word.getWord();
    }
}
