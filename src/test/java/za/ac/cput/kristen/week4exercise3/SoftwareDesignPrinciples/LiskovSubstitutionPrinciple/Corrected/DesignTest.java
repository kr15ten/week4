package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private Transport trans;

    @Before
    public void setUp() throws Exception
    {
        trans = new Car();
    }

    @Test
    public void testLSPCorrected() throws Exception
    {
        Assert.assertTrue(trans.drive());
    }
}
