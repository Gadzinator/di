package com.di.domain;

import com.di.annotation.Component;
import com.di.annotation.Value;

@Component
public class ValueAnnotationExample {
    @Value("test.value.annotation")
    private String value;
}
