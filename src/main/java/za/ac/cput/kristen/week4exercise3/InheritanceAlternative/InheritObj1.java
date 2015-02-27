package za.ac.cput.kristen.week4exercise3.InheritanceAlternative;

/**
 * Created by student on 2015/02/24.
 */
public class InheritObj1
{
    private String title;
    private Boolean qualified;
    private Inherit inher;

    public InheritObj1(String nm, int exp)
    {
        inher = new Inherit(nm, exp);
        title = "under";

        if (inher.getYears() > 5)
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

    public Inherit getParent()
    {
        return inher;
    }
}
