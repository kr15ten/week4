package za.ac.cput.kristen.week4exercise3.ObjectOrientedPrinciples.Inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/24.
 */
public class InheritTest
{
    private Inherit obj1;

    @Before
    public void setUp()
    {
            obj1 = new InheritObj1("Sandy", 5);
    }

    @Test
    public void testInheritObj1()
    {
        Assert.assertFalse(obj1.getQualifies());
    }
}
