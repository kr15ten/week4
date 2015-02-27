package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Violated;

/**
 * Created by student on 2015/02/26.
 */
public class Services implements ATMService
{
    @Override
    public void withdrawal()
    {

    }

    @Override
    public void deposit()
    {

    }

    @Override
    public int buyCar(int amount)
    {
        if (amount > 25000)
            return amount/25000;

        else
            return 0;
    }
}
