package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.DependencyInversionPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private Speak talk;

    @Before
    public void setUp() throws Exception
    {
        talk = new Speak();
    }

    @Test
    public void testDIPViolated() throws Exception
    {
        Assert.assertEquals("mamma", talk.getWord());
    }
}
