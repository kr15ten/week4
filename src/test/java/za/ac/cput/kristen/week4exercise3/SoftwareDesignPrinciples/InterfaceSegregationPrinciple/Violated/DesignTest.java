package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private Person tom;

    @Before
    public void setUp() throws Exception
    {
        tom = new Lecturer();
    }

    @Test
    public void testISPViolated() throws Exception
    {
        Assert.assertFalse(tom.studies());
    }
}
