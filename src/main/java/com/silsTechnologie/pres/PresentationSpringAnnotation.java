package com.silsTechnologie.pres;

import com.silsTechnologie.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext("com.silsTechnologie.dao", "com.silsTechnologie.metier"); //01h43s
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
