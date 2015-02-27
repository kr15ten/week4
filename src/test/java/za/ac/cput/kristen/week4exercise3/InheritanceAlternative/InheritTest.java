package za.ac.cput.kristen.week4exercise3.InheritanceAlternative;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week4exercise3.Config.AppConfig;

/**
 * Created by student on 2015/02/24.
 */
public class InheritTest
{
    private InheritObj1 obj1, obj2;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj1 = (InheritObj1)ctx.getBean("obj1");
        obj2 = (InheritObj1)ctx.getBean("obj2");
    }

    @Test
    public void testInheritObj1() throws Exception
    {
        Assert.assertTrue(obj1.getQualifies());
    }

    @Test
    public void testInheritObj2() throws Exception
    {
        Assert.assertEquals(4, obj2.getParent().getYears());
    }

    @Test
    public void testQualifiesFalse() throws Exception
    {
        Assert.assertFalse(obj2.getQualifies());
    }
}
