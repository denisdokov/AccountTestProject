package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 13.02.2017.
 */
public class OperationMonitorPage extends AbstractPage {

    //Заголовок окна
    @NameOfElement("Заголовок страницы Мониторинг операций")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Мониторинг операций\"]")
    public SelenideElement title;

    //Вкладка Операции
    @NameOfElement("Вкладка Операции")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Операции\"]")
    public SelenideElement operationsTab;

    //Поле ввода "Номер заказа"
    @NameOfElement("Номер заказа")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Мониторинг операций\"]/following::input[3]")
    public SelenideElement orderNumberEditField;

    //Кнопка выбрать
    @NameOfElement("Кнопка Выбрать")
    @FindBy(xpath = "(//td[text()=\"Выбрать\"])[2]")
    public SelenideElement searchButton;

    //Первая попавшаяся ячейка в таблице результатов поиска
    @NameOfElement("Первая строка в результатах поиска")
    @FindBy(xpath = "(//tbody/tr/td[contains(@class, \"gridCell\")]/div)[13]")
    public SelenideElement firstCell;


    //Окно "Идет загрузка данных"
    @NameOfElement("Окно Идет загрузка данных")
    @FindBy(xpath = "//i[text()=\"Идет загрузка данных. Пожалуйста, подождите\"]")
    public SelenideElement waitWindow;

    //Окно Детализация заказа
    @NameOfElement("Заголовок окна Детализация заказа")
    @FindBy(xpath = "//table/tbody/tr/td[contains(text(),\"Детализация заказа:\")]")
    public SelenideElement orderDetailsWindow;
}
