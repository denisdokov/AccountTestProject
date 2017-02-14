package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 14.02.2017.
 */
public class OrderReportPage extends AbstractPage {

    //Заголовок
    @NameOfElement("Заголовок страницы Заказать отчет")
    @FindBy(xpath="//div[@id]/table/tbody/tr/td[text()=\"Заказать отчет\"]")
    public SelenideElement title;

    //Выпадающий список "Тип:"
    @NameOfElement("Тип")
    @FindBy(xpath = "(//nobr[text()=\"Тип\"]/..)/following::td[1]")
    public SelenideElement typeComboBox;

    //Выпадающий список "Дата начала: День"
    @NameOfElement("Дата начала: День")
    @FindBy(xpath = "(//span[text()=\"Дата начала\"])/following::td[1]/table/tbody/tr/td/div")
    public SelenideElement startDayComboBox;

    //Выпадающий список "Дата начала: Месяц"
    @NameOfElement("Дата начала: Месяц")
    @FindBy(xpath = "(//span[text()=\"Дата начала\"])/following::td[4]/table/tbody/tr/td/div")
    public SelenideElement startMonthComboBox;

    //Выпадающий список "Дата начала: Год"
    @NameOfElement("Дата начала: Год")
    @FindBy(xpath = "(//span[text()=\"Дата начала\"])/following::td[7]/table/tbody/tr/td/div")
    public SelenideElement startYearComboBox;

    //Выпадающий список "Дата начала: День"
    @NameOfElement("Дата окончания: День")
    @FindBy(xpath = "(//span[text()=\"Дата окончания\"])/following::td[1]/table/tbody/tr/td/div")
    public SelenideElement endDayComboBox;

    //Выпадающий список "Дата окончания: Месяц"
    @NameOfElement("Дата начала: Месяц")
    @FindBy(xpath = "(//span[text()=\"Дата окончания\"])/following::td[4]/table/tbody/tr/td/div")
    public SelenideElement endMonthComboBox;

    //Выпадающий список "Дата окончания: Год"
    @NameOfElement("Дата начала: Год")
    @FindBy(xpath = "(//span[text()=\"Дата окончания\"])/following::td[7]/table/tbody/tr/td/div")
    public SelenideElement endYearComboBox;

    //Чекбокс По всему юр.лицу
    @NameOfElement("Чекбокс По всему юр.лицу")
    @FindBy(xpath = "(//nobr[text()=\"По всему юр.лицу\"])/preceding::span[1]")
    public SelenideElement allMerchantCheckBox;

    //Поле ввода Email получателя
    @NameOfElement("Email получателя")
    @FindBy(xpath = "(//nobr[text()=\"Email получателя\"])/following::input")
    public SelenideElement emailEditField;

    //Кнопка Заказать отчет
    @NameOfElement("Кнопка Заказать отчет")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Заказать отчёт\"]")
    public SelenideElement orderReportButton;
}
