package za.ac.cput.kristen.week4exercise3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.kristen.week4exercise3.InheritanceAlternative.InheritObj1;

/**
 * Created by student on 2015/02/25.
 */

@Configuration
public class AppConfig
{
    @Bean(name="obj1")
    public InheritObj1 getObj1()
    {
        return new InheritObj1("Susan", 8);
    }

    @Bean(name="obj2")
    public InheritObj1 getObj2()
    {
        return new InheritObj1("Amy", 4);
    }
}
