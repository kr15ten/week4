package za.ac.cput.kristen.week4exercise3.ObjectOrientedPrinciples.Polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/25.
 */
public class PolyTest
{
    private Move car, person;

    @Before
    public void setUp()
    {
        car = new CarMove();
        person = new PersonMove();
    }

    @Test
    public void testCar()
    {
        Assert.assertEquals("drives", car.getMove());
    }

    @Test
    public void testPerson()
    {
        Assert.assertEquals("walks", person.getMove());
    }
}
