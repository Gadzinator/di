package com.di.repository;

import com.di.annotation.Autowire;
import com.di.annotation.Component;
import com.di.annotation.Value;
import com.di.domain.ValueAnnotationExample;

@Component
public class Repository implements IRepository {
    @Value("my.param.db")
    public String repositoryValue;
    @Autowire
    private ValueAnnotationExample valueAnnotationExample;

    @Override
    public void execute() {
        System.out.println("Execute method in Repository. name - " + repositoryValue);
    }
}
