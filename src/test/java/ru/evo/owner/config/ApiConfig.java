package ru.evo.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/auth.properties",
        "classpath:config/api.properties"
})

public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String bearerToken();
}
