package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Corrected;

/**
 * Created by student on 2015/02/26.
 */
public class Services implements ATMService
{
    private float amount;

    public Services(float amnt)
    {
        amount = amnt;
    }

    @Override
    public float withdrawal(float amnt)
    {
        amount -= amnt;
        return amount;
    }

    @Override
    public float deposit(float amnt)
    {
        amount += amnt;
        return amount;
    }
}
