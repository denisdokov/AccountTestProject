package ru.paysecure.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.paysecure.pageobjects.LoginPage;
import ru.paysecure.pageobjects.MainPage;
import ru.paysecure.pageobjects.VirtualTerminalMotoPage;
import ru.paysecure.pageobjects.VirtualTerminalPosPage;
import ru.paysecure.pageobjects.VirtualTerminalPage;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;
import static ru.paysecure.utils.Generators.getNumber;


/**
 * Created by ddokov on 26.01.2017.
 */
public class AccountStepdefs {

    LoginPage loginPage = page(LoginPage.class);
    MainPage mainPage = page(MainPage.class);
    VirtualTerminalPage vtPage = page(VirtualTerminalPage.class);
    VirtualTerminalMotoPage vtMotoPage = page(VirtualTerminalMotoPage.class);
    VirtualTerminalPosPage vtPosPage = page(VirtualTerminalPosPage.class);

    @Given("^открыть account\\.t\\.paysecure\\.ru$")
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
        }
        else if ("Главное меню".equals(page))
        {
            mainPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Раздел виртуального терминала".equals(page))
        {
            vtPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            vtMotoPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            vtPosPage.get(elementName).shouldBe(Condition.appears);
        }


    }
    @And("^ввести в поле с именем \"([^\"]*)\" текст: \"([^\"]*)\" в \"([^\"]*)\"$")
    public void typeToInputWithNameText(String nameOfElement, String text, String page)
    {
        if ("$Номер заказа".equals(text))
        {
            text = getNumber();
        }
        if ("Cтраница входа".equals(page))
        {
            loginPage.get(nameOfElement).sendKeys(text);
        }
        else if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            vtMotoPage.get(nameOfElement).sendKeys(text);
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            sleep(500);
            vtPosPage.get(nameOfElement).sendKeys(text);
        }
    }
    @And("^из выпадающего списка \"([^\"]*)\" выбрать элемент \"([^\"]*)\" в \"([^\"]*)\"$")
    public void selectItemFromCombobox(String elementName, String text, String page)
    {
        if ("Раздел виртуального терминала".equals(page))
        {
            vtPage.get(elementName).sendKeys(text);
        }
        else if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            vtMotoPage.get(elementName).sendKeys(text);
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            vtPosPage.get(elementName).sendKeys(text);
        }
    }

    @And("^подождать пока пропадет элемент \"([^\"]*)\" в \"([^\"]*)\"$")
    public void waitUntiEllementDisappears(String elementName, String page)
    {
        if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            vtMotoPage.get(elementName).waitUntil(Condition.disappears, 10000);
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            vtPosPage.get(elementName).waitUntil(Condition.disappears, 10000);
        }
    }

    @When("^кликнуть по элементу с именем \"([^\"]*)\" в \"([^\"]*)\"$")
    public void clickElement(String elementName, String page)
    {
        if ("Cтраница входа".equals(page))
        {
            loginPage.get(elementName).click();
        }
        else if ("Главное меню".equals(page))
        {
            mainPage.get(elementName).click();
        }
        else if ("Раздел виртуального терминала".equals(page))
        {
            vtPage.get(elementName).click();
        }
        else if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            vtMotoPage.get(elementName).click();
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            vtPosPage.get(elementName).click();
        }

    }
}
