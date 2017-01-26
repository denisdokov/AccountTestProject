package ru.paysecure.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.paysecure.pageobjects.LoginPage;
import ru.paysecure.pageobjects.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;


/**
 * Created by ddokov on 26.01.2017.
 */
public class LoginStepdefs {

    LoginPage loginPage = page(LoginPage.class);
    MainPage mainPage = page(MainPage.class);

    @Given("^открыть account\\.paysecure\\.ru$")
    public void openAccount()
    {
        open("http://account.t.paysecure.ru");
    }


    @And("^проверить, что элемент с именем \"([^\"]*)\" отображается в \"([^\"]*)\"$")
    public void checkThatElementWithNameIsDisplayed(String elementName, String page)
    {
        if ("Страница входа".equals(page))
        {
            loginPage.get(elementName).shouldBe(Condition.appears);
        } else if ("Главное меню".equals(page))
        {
            mainPage.get(elementName).shouldBe(Condition.appears);
        }

    }
    @And("^ввести в поле с именем \"([^\"]*)\" текст: \"([^\"]*)\" в \"([^\"]*)\"$")
    public void typeToInputWithNameText(String nameOfElement, String text, String page)
    {
        loginPage.get(nameOfElement).sendKeys(text);
    }
    @When("^кликнуть по элементу с именем \"([^\"]*)\" в \"([^\"]*)\"$")
    public void press(String button, String page)
    {
        loginPage.get(button).click();
    }


}
