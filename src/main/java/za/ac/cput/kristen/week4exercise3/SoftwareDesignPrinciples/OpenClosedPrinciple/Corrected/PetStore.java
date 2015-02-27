package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class PetStore
{
    private IBuy buy;

    public PetStore()
    {
        //buy = new Buy();
        buy = new Buy2();
    }

    public double buyAnimal(String animal)
    {
        return buy.buySomething(animal);
    }
}
