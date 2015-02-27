package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleResponsibilityPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Corrected.ATMService;
import za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Corrected.Services;

/**
 * Created by student on 2015/02/26.
 */
public class DesignTest
{
    private ATMService serv;

    @Before
    public void setUp() throws Exception
    {
        serv = new Services(52000);
    }

    @Test
    public void testSRPCorrected()
    {
        Assert.assertNotNull(serv.withdrawal(5000));
    }
}
