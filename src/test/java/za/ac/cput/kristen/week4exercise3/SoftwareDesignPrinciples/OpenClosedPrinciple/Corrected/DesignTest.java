package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected.PetStore;

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
    public void testOCPCorrected()
    {
        //Assert.assertEquals(5.16, buy.buyAnimal("cat"), 2);
        Assert.assertEquals(15.16, buy.buyAnimal("tortoise"), 2);
    }
}
