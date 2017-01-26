package ru.paysecure.runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by ddokov on 26.01.2017.
 */
@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report/login", "json:target/cucumber.json"},
        features = "src/test/java/ru/paysecure/features",
        glue = "ru/paysecure/steps",
        tags = "@logintest")

public class LoginTest
{

    @BeforeClass
    static public void setupTimeout()
    {
        Configuration.timeout = 10000;
            }
}