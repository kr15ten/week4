package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.DependencyInversionPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private Words talk;

    @Before
    public void setUp() throws Exception
    {
        talk = new Speak();
    }

    @Test
    public void testDIPCorrected() throws Exception
    {
        Assert.assertEquals("mamma", talk.getWord("mamma"));
    }
}
