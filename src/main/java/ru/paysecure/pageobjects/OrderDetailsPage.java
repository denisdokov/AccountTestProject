package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 13.02.2017.
 */
public class OrderDetailsPage extends AbstractPage {

    //Заголовок окна Детализация заказа
    @NameOfElement("Заголовок окна Детализация заказа")
    @FindBy(xpath = "//table/tbody/tr/td[contains(text(),\"Детализация заказа:\")]")
    public SelenideElement title;

    //Вкладка Общая информация
    @NameOfElement("Вкладка Общая информация")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Общая информация\"]")
    public SelenideElement mainInfoTab;

    //Вкладка Операции
    @NameOfElement("Вкладка Операции")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Общая информация\"]/following::td[1]")
    public SelenideElement operaionsTab;

    //Заголовок раздела Информация о заказе
    @NameOfElement("Заголовок раздела Информация о заказе")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Информация о заказе\"]")
    public SelenideElement orderInfoTitle;

    //Заголовок раздела Информация о платежном средстве
    @NameOfElement("Заголовок раздела Информация о платежном средстве")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Информация о платежном средстве\"]")
    public SelenideElement meanInfoTitle;

    //Заголовок раздела Информация о покупателе
    @NameOfElement("Заголовок раздела Информация о покупателе")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Информация о покупателе\"]")
    public SelenideElement customerInfoTitle;

    //Заголовок раздела Информация о мерчанте
    @NameOfElement("Заголовок раздела Информация о мерчанте")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Информация о мерчанте\"]")
    public SelenideElement merchantInfoTitle;

    //Заголовок раздела Прочая информация
    @NameOfElement("Заголовок раздела Прочая информация")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Прочая информация\"]")
    public SelenideElement otherInfoTitle;
}
