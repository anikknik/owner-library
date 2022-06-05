package ru.evo.owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.evo.owner.config.ApiConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @Test
    void apiEqualTest() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseUrl())
                .isEqualTo("https://github.com");
        assertThat(config.bearerToken())
                .isEqualTo("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJINHNJQUFBQUFBQUFc");
    }
}