package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 26.01.2017.
 */
public class MainPage extends AbstractPage {

    //Заголовок
    @NameOfElement("Заголовок главной страницы")
    @FindBy(xpath="//tbody/tr/td[text()=\"Основная информация\"]")
    public SelenideElement title;

    //Пункт меню "Виртуальный терминал"
    @NameOfElement("Вкладка виртуального терминала")
    @FindBy (xpath = "//td/div/table/tbody/tr/td[text()=\"Виртуальный терминал\"]")
    public SelenideElement virtualTerminalTab;

    //Пункт меню "Счета"
    @NameOfElement("Вкладка Счета")
    @FindBy(xpath = "//td/div/table/tbody/tr/td[text()=\"Счета\"]")
    public SelenideElement billsTab;

    //Пункт меню "Мониторинг заказов"
    @NameOfElement("Вкладка Мониторинг заказов")
    @FindBy (xpath = "//td/div/table/tbody/tr/td[text()=\"Мониторинг заказов\"]")
    public SelenideElement monitorTab;

    //Пункт меню "Заказать отчет"
    @NameOfElement("Вкладка Заказать отчет")
    @FindBy (xpath = "//td/div/table/tbody/tr/td[text()=\"Заказать отчет\"]")
    public SelenideElement reportTab;



}
