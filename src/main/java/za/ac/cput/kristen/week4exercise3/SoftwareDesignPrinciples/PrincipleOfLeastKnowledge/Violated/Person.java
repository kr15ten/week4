package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.PrincipleOfLeastKnowledge.Violated;

/**
 * Created by kris on 2/27/15.
 */
public class Person implements IPerson
{
    private String name;
    private PreviousHome home;

    Person(String nm, int hmNumber)
    {
        name = nm;
        home = new PreviousHome(hmNumber);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public PreviousHome getPreviousHome() {
        return home;
    }
}
