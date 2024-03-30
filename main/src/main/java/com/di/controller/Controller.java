package com.di.controller;

import com.di.annotation.Autowire;
import com.di.annotation.Component;
import com.di.service.IService;

@Component
public class Controller implements IController {

    private final IService service;

    @Autowire
    public Controller(IService service) {
        this.service = service;
    }

    @Override
    public void executeController() {
        System.out.println("Execute method in Controller");
        service.execute();
    }
}
