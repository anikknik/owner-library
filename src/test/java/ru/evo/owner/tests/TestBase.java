package ru.evo.owner.tests;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import ru.evo.owner.config.WebConfig;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void beforeTest() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.browser = webConfig.getBrowser();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        if (!webConfig.getRemoteWebDriver().equals("")) {
            Configuration.remote = webConfig.getRemoteWebDriver();
        }


        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        open(baseUrl);

    }

}