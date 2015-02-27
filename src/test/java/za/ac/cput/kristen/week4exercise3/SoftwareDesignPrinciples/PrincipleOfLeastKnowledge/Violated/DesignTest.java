package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.PrincipleOfLeastKnowledge.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private IPerson oldInfo;

    @Before
    public void setUp() throws Exception
    {
        oldInfo = new Person("Sally", 12345);
    }

    @Test
    public void testPLKViolated() throws Exception
    {
        Assert.assertEquals(12345, oldInfo.getPreviousHome().getNumber());
    }
}
