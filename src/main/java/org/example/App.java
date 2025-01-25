package org.example;
import org.springframework.context.ApplicationContext;           // For ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();

    }
}
