package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.CompositeReusePrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private File txt;

    @Before
    public void setUp() throws Exception
    {
        txt = new WordFile();
    }

    @Test
    public void testCRPViolated() throws Exception
    {
        Assert.assertTrue(txt.containsWords());
    }
}
