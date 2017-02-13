package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 10.02.2017.
 */
public class OrderMonitorPage extends AbstractPage {

    //Заголовок окна
    @NameOfElement("Заголовок страницы Мониторинг заказов")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Мониторинг заказов\"]")
    public SelenideElement title;

    //Вкладка Заказы
    @NameOfElement("Вкладка Заказы")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Заказы\"]")
    public SelenideElement ordersTab;

    //Вкладка Операции
    @NameOfElement("Вкладка Операции")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Операции\"]")
    public SelenideElement operationsTab;

    //Поле ввода "Номер заказа"
    @NameOfElement("Номер заказа")
    @FindBy(xpath = "//label/nobr[text()=\"Номер заказа\"]/../following::input[1]")
    public SelenideElement orderNumberEditField;

    //Кнопка выбрать
    @NameOfElement("Кнопка Выбрать")
    @FindBy(xpath = "(//td[text()=\"Выбрать\"])[1]")
    public SelenideElement searchButton;

    //Первая попавшаяся ячейка в таблице результатов поиска
    @NameOfElement("Первая строка в результатах поиска")
    @FindBy(xpath = "(//tbody/tr/td[contains(@class, \"gridCell\")]/div)[13]")
    public SelenideElement firstCell;

    //Пункт контекстного меню "Возврат денег"
    @NameOfElement("Пункт меню Возврат денег")
    @FindBy (xpath = "//tbody/tr/td/nobr[text()=\"Возврат денег\"]")
    public SelenideElement refundMenuItem;

    //Пункт контекстного меню "Подтверждение"
    @NameOfElement("Пункт меню Подтверждение")
    @FindBy (xpath = "//tbody/tr/td/nobr[text()=\"Подтверждение\"]")
    public SelenideElement ApproveMenuItem;

    //Окно "Идет загрузка данных"
    @NameOfElement("Окно Идет загрузка данных")
    @FindBy(xpath = "//i[text()=\"Идет загрузка данных. Пожалуйста, подождите\"]")
    public SelenideElement waitWindow;

    //Окно Детализация заказа
    @NameOfElement("Заголовок окна Детализация заказа")
    @FindBy(xpath = "//table/tbody/tr/td[contains(text(),\"Детализация заказа:\")]")
    public SelenideElement orderDetailsWindow;
}
