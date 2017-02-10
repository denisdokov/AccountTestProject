package ru.paysecure.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.uk.Нехай;
import cucumber.api.java.uk.Припустимощо;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import ru.paysecure.pageobjects.*;
import ru.paysecure.utils.OpDetails;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;
import static ru.paysecure.utils.Generators.getNumber;
import static ru.paysecure.utils.HttpOperations.SilentPay;


/**
 * Created by ddokov on 26.01.2017.
 */
public class AccountStepdefs {

    LoginPage loginPage = page(LoginPage.class);
    MainPage mainPage = page(MainPage.class);
    VirtualTerminalPage vtPage = page(VirtualTerminalPage.class);
    VirtualTerminalMotoPage vtMotoPage = page(VirtualTerminalMotoPage.class);
    VirtualTerminalPosPage vtPosPage = page(VirtualTerminalPosPage.class);
    BillsPage billsPage = page(BillsPage.class);
    NewBillPage newBillPage = page(NewBillPage.class);
    InfoPage infoPage = page(InfoPage.class);
    MonitorPage monitorPage = page(MonitorPage.class);
    ApprovePage approvePage = page(ApprovePage.class);
    RefundPage refundPage = page(RefundPage.class);


    @Given("^открыть \"([^\"]*)\"$")
    public void openAccount(String url)
    {
        open("http://" + url);
    }

    @Given("^создать заказ на сервисе \"([^\"]*)\" при delay = \"([^\"]*)\" и запомнить \"([^\"]*)\"$")
    public void SilentPayDelayAndSave(String url, String delay, String paramName)
    {
        String OrderNumber = getNumber();

        String silentURL;
        silentURL = SilentPay(url, "772545", OrderNumber, "101", "RUB", "RU", delay, "SilentPay with delay cucumber pay", "test1602rgk2", "test1602rgk3", "0", "1", "4111111111111111", "12", "2020", "SER", "123",
                "10.20.10.18", "Selenide", "Cucumber", "Test", "assistqa1@gmail.ru", "SPb", "21212", "Russia", "78", "SPb", "", "", "25555");
        open(silentURL);
        if("Номер заказа".equals(paramName))
        {
            OpDetails.setOrderNumber(OrderNumber);
        }

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
        else if ("Раздел Счета".equals(page))
        {
            billsPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Окно Новый счет".equals(page))
        {
            newBillPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Информационное сообщение".equals(page))
        {
            infoPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Раздел Мониторинг заказов".equals(page))
        {
            monitorPage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Окно Подтверждение".equals(page))
        {
            approvePage.get(elementName).shouldBe(Condition.appears);
        }
        else if ("Окно Возврат денег".equals(page))
        {
            refundPage.get(elementName).;
            refundPage.get(elementName).shouldBe(Condition.appears);
        }





    }
    @And("^ввести в поле с именем \"([^\"]*)\" текст: \"([^\"]*)\" в \"([^\"]*)\"$")
    public void typeToInputWithNameText(String elementName, String text, String page)
    {
        if ("$Номер заказа".equals(text) || "$Номер счета".equals(text))
        {
            text = getNumber();
        }
        if ("Cтраница входа".equals(page))
        {
            loginPage.get(elementName).sendKeys(text);
        }
        else if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            vtMotoPage.get(elementName).scrollTo().sendKeys(text);
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            vtPosPage.get(elementName).scrollTo().sendKeys(text);
        }
        else if ("Окно Новый счет".equals(page))
        {
            newBillPage.get(elementName).scrollTo().sendKeys(text);
        }
    }

    @And("^ввести в поле с именем \"([^\"]*)\" ранее запомненный \"([^\"]*)\" в \"([^\"]*)\"$")
    public void typeToInputWithNameSavedText(String elementName, String savedText, String page)
    {
        if ("Номер заказа".equals(savedText))
        {
            savedText = OpDetails.getOrderNumber();
        }

        if ("Раздел Мониторинг заказов".equals(page))
        {
            monitorPage.get(elementName).sendKeys(savedText);
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
        else if ("Окно Новый счет".equals(page))
        {
            newBillPage.get(elementName).sendKeys(text);
        }
    }

    @And("^ожидать пока пропадет элемент \"([^\"]*)\" в \"([^\"]*)\"$")
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
        else if ("Раздел Мониторинг заказов".equals(page))
        {
            monitorPage.get(elementName).waitUntil(Condition.disappears, 10000);;
        }

    }

    @And("^в контекстном меню у элемента с именем \"([^\"]*)\" выбрать \"([^\"]*)\" в \"([^\"]*)\"$")
    public void getContextMenuOnElement(String elementName, String menuItem, String page)
    {
        if ("Раздел Мониторинг заказов".equals(page))

        {
            if ("Пункт меню Подтверждение".equals(menuItem)) //TODO разобраться почему не кликает в пункты меню
            {
                Selenide.actions().contextClick(monitorPage.get(elementName)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
            }
            else if ("Пункт меню Возврат денег".equals(menuItem)) //TODO разобраться почему не кликает в пункты меню
            {
                Selenide.actions().contextClick(monitorPage.get(elementName)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
            }

        }
    }

    @And("^ожидать пока отработает скрипт на странице \"([^\"]*)\"$")
    public void waitUntiScripFinished(String page)
    {
        if ("Раздел виртуального терминала (MOTO - платеж)".equals(page))
        {
            sleep(500); //TODO разобраться как дождаться окончания работы скрипта програмно (это маскирование номера карты?)
        }
        else if ("Раздел виртуального терминала (POS - платеж)".equals(page))
        {
            sleep(500); //TODO разобраться как дождаться окончания работы скрипта програмно (это маскирование номера карты?)
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
        else if ("Раздел Счета".equals(page))
        {
            billsPage.get(elementName).click();
        }
        else if ("Окно Новый счет".equals(page))
        {
            newBillPage.get(elementName).click();
        }
        else if ("Информационное сообщение".equals(page))
        {
            infoPage.get(elementName).click();
        }
        else if ("Раздел Мониторинг заказов".equals(page))
        {
            monitorPage.get(elementName).click();
        }
        else if ("Окно Подтверждение".equals(page))
        {
            approvePage.get(elementName).click();
        }
        else if ("Окно Возврат денег".equals(page))
        {
            refundPage.get(elementName).click();
        }

    }

}
