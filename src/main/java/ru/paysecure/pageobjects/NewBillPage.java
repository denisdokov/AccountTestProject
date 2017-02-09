package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 09.02.2017.
 */
public class NewBillPage extends AbstractPage {

    //Заголовок окна
    @NameOfElement("Заголовок окна Новый счет")
    @FindBy(xpath = "(//*[@id]/table/tbody/tr/td[text()=\"Новый счёт\"])[1]")
    public SelenideElement title;

    //Выпадающий список мерчантов
    @NameOfElement("Мерчант")
    @FindBy(xpath = "(//*[text()=\"Мерчант\"]/..)/following-sibling::td[1]/table/tbody/tr/td/div")
    public SelenideElement merchantComboBox;

    //Поле для ввода "Номер счета"
    @NameOfElement("Номер счета")
    @FindBy(xpath = "(//label[text()=\"Номер счёта\"]/..)/following::td[1]/input")
    public SelenideElement billNumberEditField;

    //Поле для ввода "Сумма счета"
    @NameOfElement("Сумма счета")
    @FindBy(xpath = "(//label[text()=\"Сумма счёта\"]/..)/following::td[1]/input")
    public SelenideElement billAmountEditField;

    //Выпадающий список валют
    @NameOfElement("Валюта")
    @FindBy(xpath = "(//label[text()=\"Валюта\"]/..)/following::table[1]/tbody/tr/td/div")
    public SelenideElement currencyComboBox;

    //Поле ввода "Коментарий"
    @NameOfElement("Комментарии")
    @FindBy(xpath = "(//label[text()=\"Комментарий\"])[1]/following::td/textarea")
    public SelenideElement commentEditField;

    //Выпадающий список "Язык"
    @NameOfElement("Язык")
    @FindBy(xpath = "(//label[text()=\"Язык\"])[1]/../../following::div[1]")
    public SelenideElement languageComboBox;

    //Поле ввода "Номер клиента"
    @NameOfElement("Номер клиента")
    @FindBy(xpath = "(//label[text()=\"Номер клиента\"])[1]/../following::input[1]")
    public SelenideElement ClientNumberEditField;

    //Поле ввода "Имя"
    @NameOfElement("Имя")
    @FindBy(xpath = "(//label[text()=\"Имя\"])[1]/../following::input[1]")
    public SelenideElement firstnameEditField;

    //Поле ввода "Фамилия"
    @NameOfElement("Фамилия")
    @FindBy(xpath = "(//label[text()=\"Фамилия\"])[1]/../following::input[1]")
    public SelenideElement lastnameEditField;

    //Поле ввода "Отчество"
    @NameOfElement("Отчество")
    @FindBy(xpath = "(//label[text()=\"Отчество\"])[1]/../following::input[1]")
    public SelenideElement middlenameEditField;

    //Поле ввода "Телефон"
    @NameOfElement("Телефон")
    @FindBy(xpath = "(//label[text()=\"Телефон\"])[1]/../following::input[1]")
    public SelenideElement PhoneEditField;

    //Поле ввода "Мобильный телефон"
    @NameOfElement("Мобильный телефон")
    @FindBy(xpath = "(//label[text()=\"Мобильный телефон\"])[1]/../following::input[1]")
    public SelenideElement MobilePhoneEditField;

    //Поле ввода "E-mail"
    @NameOfElement("E-mail")
    @FindBy(xpath = "(//label[text()=\"E-mail\"])[1]/../following::input[1]")
    public SelenideElement EmailEditField;

    //Поле ввода "Отправить счёт"
    @NameOfElement("Отправить счёт")
    @FindBy(xpath = "(//label[text()=\"Отправить счёт\"]/..)/following::table[1]/tbody/tr/td/div")
    public SelenideElement SendBillEditField;

    //Кнопка "Сохранить"
    @NameOfElement("Кнопка Сохранить")
    @FindBy(xpath = ".//div[@id]/table/tbody/tr/td[text()=\"Сохранить\"]")
    public SelenideElement saveButton;


}
