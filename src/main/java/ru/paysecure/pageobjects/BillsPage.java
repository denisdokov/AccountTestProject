package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 09.02.2017.
 */
public class BillsPage extends AbstractPage {

    //Строка заголовка
    @NameOfElement("Заголовок страницы Счета")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Счета\"]")
    public SelenideElement title;

    //Кнопка "Новый счет"
    @NameOfElement("Кнопка Новый счёт")
    @FindBy(xpath = "//div[text()=\"Новый счёт\"]")
    public SelenideElement newbillButton;


    //Поле ввода для поиска по номеру счета
    @FindBy(xpath = "//label[@id]/nobr[text()=\"Номер счёта\"]/../following::input")
    public SelenideElement billNumberSearchField;
}
