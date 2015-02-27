package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 2/27/15.
 */
public class DesignTest
{
    private IStudent clara;
    //private ILecturer tom;

    @Before
    public void setUp() throws Exception
    {
        clara = new Student();
        //tom = new Lecturer();
    }

    @Test
    public void testISPCorrected() throws Exception
    {
        Assert.assertTrue(clara.studies());
        //Assert.assertTrue(tom.teaches());
    }
}
