package za.ac.cput.kristen.week4exercise3.ObjectOrientedPrinciples.Inheritance;

/**
 * Created by student on 2015/02/24.
 */
public abstract class Inherit
{
    private String name;
    private int yearsOfExperience;

    public Inherit(String nm, int exp)
    {
        name = nm;
        yearsOfExperience = exp;
    }

    public int getYears()
    {
        return yearsOfExperience;
    }
    public abstract Boolean getQualifies();
}
