package com.di.service;

import com.di.annotation.Autowire;
import com.di.annotation.Component;
import com.di.repository.IRepository;

@Component
public class Service implements IService {

    private IRepository repository;

    @Autowire
    public void setRepository(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.println("Execute method in Service");
        repository.execute();
    }
}
