package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//используя аннотации
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-context-annotation.xml");
        ctx.refresh();
        CollectionsTestAnnotation instance =
                (CollectionsTestAnnotation) ctx.getBean("injectCollectionAnnotation");    //создает из аннотации
        instance.displayInfo();
    }
}
