package com.di;

import com.di.controller.IController;

import java.lang.reflect.InvocationTargetException;


public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        ApplicationContext context = ApplicationRunner.run("com.di");
        context.getObject(IController.class).executeController();
    }
}