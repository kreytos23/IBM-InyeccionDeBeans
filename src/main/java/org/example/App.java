package org.example;

import beans.Saludo;
import beans.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    public static void main( String[] args ){



        /*Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Cesar");
        System.out.println(saludo.getMensaje());*/

        /*ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) appContext.getBean("saludo");
        System.out.println(saludo.getMensaje());
        ((AbstractApplicationContext) appContext).close();*/

        /*ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Saludo saludo = (Saludo) appContext.getBean("saludo");
        System.out.println(saludo.getMensaje());
        ((AbstractApplicationContext) appContext).close();*/

        /*ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigTwo.class);
        Saludo saludo = (Saludo) appContext.getBean("despedida");
        System.out.println(saludo.getMensaje());
        ((AbstractApplicationContext) appContext).close();*/

        /*AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(AppConfig.class);
        appContext.register(AppConfigTwo.class);
        appContext.refresh();
        Saludo saludo = (Saludo) appContext.getBean("saludo",Saludo.class);
        System.out.println(saludo.getMensaje());
        ((AbstractApplicationContext) appContext).close();*/

        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        SaludoService saludo = (SaludoService) appContext.getBean("saludoService");
        saludo.Saludar();
        ((AbstractApplicationContext) appContext).close();

    }
}
