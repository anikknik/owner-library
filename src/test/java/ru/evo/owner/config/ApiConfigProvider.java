package ru.evo.owner.config;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigProvider {
    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
}