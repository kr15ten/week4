package za.ac.cput.kristen.week4exercise3.AcyclicDependencyPrinciples.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class AcyclicTest
{
    private Parent mom;

    @Before
    public void setUp() throws Exception
    {
        mom = new Parent();
    }

    @Test
    public void testADPViolated() throws Exception
    {
        Assert.assertEquals(300.00, mom.getMoney(2000), 2);
    }
}
