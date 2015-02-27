package za.ac.cput.kristen.week4exercise3.ObjectOrientedPrinciples.Encapsulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/24.
 */
public class EncapsulationTest
{
    private Encaps obj;

    @Before
    public void setUp()
    {
        obj = new Encaps("Amy", 12);
    }

    @Test
    public void testEncaps()
    {
        Assert.assertEquals("pasta", obj.getFavFood());
    }
}
