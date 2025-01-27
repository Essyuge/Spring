package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.config.AppConfig;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Desktop dk = context.getBean( Desktop.class);
         dk.compile();


        Desktop dk1 = context.getBean( Desktop.class);
        dk.compile();






//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();

    }
}
