package za.ac.cput.kristen.week4exercise3.ObjectOrientedPrinciples.Inheritance;

/**
 * Created by student on 2015/02/24.
 */
public class InheritObj1 extends Inherit
{
    private String title;
    private Boolean qualified;

    public InheritObj1(String nm, int exp)
    {
        super(nm, exp);
        title = "under";

        if (super.getYears() > 5)
        {
            qualified = true;
        }
        else
            qualified = false;
    }

    public Boolean getQualifies()
    {
        return qualified;
    }
}
