package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.OpenClosedPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private PetStore buy;

    @Before
    public void setUp() throws Exception
    {
        buy = new PetStore();
    }

    @Test
    public void testOCPViolated()
    {
        Assert.assertEquals(5.16, buy.buyCat(),2);
    }
}
