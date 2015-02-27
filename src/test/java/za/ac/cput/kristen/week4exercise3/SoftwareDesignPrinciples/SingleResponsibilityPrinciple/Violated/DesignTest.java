package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleResponsibilityPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Violated.ATMService;
import za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Violated.Services;

/**
 * Created by student on 2015/02/26.
 */
public class DesignTest
{
    private ATMService serv;

    @Before
    public void setUp() throws Exception
    {
        serv = new Services();
    }

    @Test
    public void testSRPViolated()
    {
        Assert.assertNotNull(serv.buyCar(4));
    }
}
