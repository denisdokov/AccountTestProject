package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 30.01.2017.
 */
public class VirtualTerminalMotoPage extends AbstractPage {

    //Поле ввода "Номер заказа"(MOTO)
    @NameOfElement("Номер заказа")
    @FindBy(xpath = "(//label[text()=\"Номер заказа\"])[1]/../../following::input[1]")
    public SelenideElement orderNumberEditField;

    //Поле ввода "Сумма"(MOTO)
    @NameOfElement("Сумма")
    @FindBy(xpath = "(//label[text()=\"Сумма\"])[1]/../../following::input[1]")
    public SelenideElement amountEditField;

    //Поле ввода "Валюта"(MOTO)
    @NameOfElement("Валюта")
    @FindBy(xpath = "(//label[text()=\"Валюта\"])[1]/../../following::div[1]")
    public SelenideElement currencyComboBox;

    //Поле ввода "E-mail"(MOTO)
    @NameOfElement("E-mail")
    @FindBy(xpath = "(//label[text()=\"E-mail\"])[1]/../../following::input[1]")
    public SelenideElement emailEditField;

    //Поле ввода "Язык"(MOTO)
    @NameOfElement("Язык")
    @FindBy(xpath = "(//label[text()=\"Язык\"])[1]/../../following::div[1]")
    public SelenideElement languageComboBox;

    //Поле ввода "Коментарий"(MOTO)
    @NameOfElement("Комментарии")
    @FindBy(xpath = "(//label[text()=\"Комментарий\"])[1]/following::td/textarea")
    public SelenideElement commentEditField;

    //Поле ввода "Фамилия"(MOTO)
    @NameOfElement("Фамилия")
    @FindBy(xpath = "(//label[text()=\"Фамилия\"])[1]/../../following::input[1]")
    public SelenideElement lastnameEditField;

    //Поле ввода "Имя"(MOTO)
    @NameOfElement("Имя")
    @FindBy(xpath = "(//label[text()=\"Имя\"])[1]/../../following::input[1]")
    public SelenideElement firstnameEditField;

    //Поле ввода "Отчество"(MOTO)
    @NameOfElement("Отчество")
    @FindBy(xpath = "(//label[text()=\"Отчество\"])[1]/../../following::input[1]")
    public SelenideElement middlenameEditField;

    //Поле ввода "Тип"(MOTO)
    @NameOfElement("Тип")
    @FindBy(xpath = "(//td[text()=\"Данные банковской карты\"])[1]/../../../../preceding::form[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div")
    public SelenideElement typeComboBox;

    //Поле ввода "Номер карты"(MOTO)
    @NameOfElement("Номер карты")
    @FindBy(xpath = "(//label[text()=\"Номeр кaрты\"])[1]/../../../following::input[1]")
    public SelenideElement cardNumberEditField;

    //Поле ввода "Срок действия" - месяц(MOTO)
    @NameOfElement("Месяц")
    @FindBy(xpath = "(//b[text()=\"Срок действия\"])[1]/../following::table/tbody/tr/td/div[contains(@style, \"width:32px;height:12px;\")]")
    public SelenideElement expireMonthComboBox;

    //Поле ввода "Срок действия" - год(MOTO)
    @NameOfElement("Год")
    @FindBy(xpath = "(//b[text()=\"Срок действия\"])[1]/../following::table/tbody/tr/td/div[contains(@style, \"width:37px;height:12px;\")]")
    public SelenideElement expireYearComboBox;

    //Поле ввода "Держатель"(MOTO)
    @NameOfElement("Держатель")
    @FindBy(xpath = "(//label[text()=\"Дeржaтeль\"])[1]/../../following::input[1]")
    public SelenideElement cardHolderEditField;

    //Поле ввода "CVV2/CVC2/4DBC"(MOTO)
    @NameOfElement("CVV")
    @FindBy(xpath = "(//label[text()=\"СVV2/СVC2/4DBС\"])[1]/../../following::input[1]")
    public SelenideElement cvvEditField;

    //Кнопка "Оплатить"
    @NameOfElement("Кнопка Оплатить")
    @FindBy(xpath = "(//div[@id]/table/tbody/tr/td[text()=\"Оплатить\"])[1]")
    public SelenideElement payButton;

    //Окно "Идет оплата"
    @NameOfElement("Окно Идет оплата")
    @FindBy(xpath = "//td[text()=\"Идет оплата\"]")
    public SelenideElement waitWindow;

    //Сообщение "Завершено Успешно"
    @NameOfElement("Сообщение Завершено успешно")
    @FindBy(xpath = "//tr/td/div[text()=\"Завершено успешно \"]")
    public SelenideElement okMessage;
}
