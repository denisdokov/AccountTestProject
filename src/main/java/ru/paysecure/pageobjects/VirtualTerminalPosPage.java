package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 31.01.2017.
 */
public class VirtualTerminalPosPage extends AbstractPage {

    //Поле ввода "Номер заказа"(POS)
    @NameOfElement("Номер заказа")
    @FindBy(xpath = "(//label[text()=\"Номер заказа\"])[2]/../../following::input[1]")
    public SelenideElement orderNumberEditField;

    //Поле ввода "Сумма"(POS)
    @NameOfElement("Сумма")
    @FindBy(xpath = "(//label[text()=\"Сумма\"])[2]/../../following::input[1]")
    public SelenideElement amountEditField;

    //Поле ввода "Валюта"(POS)
    @NameOfElement("Валюта")
    @FindBy(xpath = "(//label[text()=\"Валюта\"])[2]/../../following::div[1]")
    public SelenideElement currencyComboBox;

    //Поле ввода "E-mail"(POS)
    @NameOfElement("E-mail")
    @FindBy(xpath = "(//label[text()=\"E-mail\"])[2]/../../following::input[1]")
    public SelenideElement emailEditField;

    //Поле ввода "Язык"(POS)
    @NameOfElement("Язык")
    @FindBy(xpath = "(//label[text()=\"Язык\"])[2]/../../following::div[1]")
    public SelenideElement languageComboBox;

    //Поле ввода "Коментарий"(POS)
    @NameOfElement("Комментарии")
    @FindBy(xpath = "(//label[text()=\"Комментарий\"])[2]/following::td/textarea")
    public SelenideElement commentEditField;

    //Поле ввода "Фамилия"(POS)
    @NameOfElement("Фамилия")
    @FindBy(xpath = "(//label[text()=\"Фамилия\"])[2]/../../following::input[1]")
    public SelenideElement lastnameEditField;

    //Поле ввода "Имя"(POS)
    @NameOfElement("Имя")
    @FindBy(xpath = "(//label[text()=\"Имя\"])[2]/../../following::input[1]")
    public SelenideElement firstnameEditField;

    //Поле ввода "Отчество"(POS)
    @NameOfElement("Отчество")
    @FindBy(xpath = "(//label[text()=\"Отчество\"])[2]/../../following::input[1]")
    public SelenideElement middlenameEditField;

    //Поле ввода "Тип"(POS)
    @NameOfElement("Тип")
    @FindBy(xpath = "(//td[text()=\"Данные банковской карты\"])[2]/../../../../preceding::form[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div")
    public SelenideElement typeComboBox;

    //Поле ввода "Номер карты"(POS)
    @NameOfElement("Номер карты")
    @FindBy(xpath = "(//label[text()=\"Номeр кaрты\"])[2]/../../../following::input[1]")
    public SelenideElement cardNumberEditField;

    //Поле ввода "Срок действия" - месяц(POS)
    @NameOfElement("Месяц")
    @FindBy(xpath = "(//b[text()=\"Срок действия\"])[2]/../following::table/tbody/tr/td/div[contains(@style, \"width:32px;height:12px;\")]")
    public SelenideElement expireMonthComboBox;

    //Поле ввода "Срок действия" - год(POS)
    @NameOfElement("Год")
    @FindBy(xpath = "(//b[text()=\"Срок действия\"])[2]/../following::table/tbody/tr/td/div[contains(@style, \"width:37px;height:12px;\")]")
    public SelenideElement expireYearComboBox;

    //Поле ввода "Держатель"(POS)
    @NameOfElement("Держатель")
    @FindBy(xpath = "(//label[text()=\"Дeржaтeль\"])[2]/../../following::input[1]")
    public SelenideElement cardHolderEditField;

    //Поле ввода "CVV2/CVC2/4DBC"(POS)
    @NameOfElement("CVV")
    @FindBy(xpath = "(//label[text()=\"СVV2/СVC2/4DBС\"])[2]/../../following::input[1]")
    public SelenideElement cvvEditField;

    //Кнопка "Оплатить"
    @NameOfElement("Кнопка Оплатить")
    @FindBy(xpath = "(//div[@id]/table/tbody/tr/td[text()=\"Оплатить\"])[2]")
    public SelenideElement payButton;

    //Окно "Идет оплата"
    @NameOfElement("Окно Идет оплата")
    @FindBy(xpath = "//td[text()=\"Идет оплата\"]")
    public SelenideElement waitWindow;

    //Сообщение "Завершено Успешно"
    @NameOfElement("Сообщение Завершено успешно")
    @FindBy(xpath = "//tr/td/div[text()=\"AS000\"]")
    public SelenideElement okMessage;

}
