package com.di.config;

public interface Config {
    <T> Class<T> resolveImpl(Class<T> type);
}
