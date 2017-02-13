package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 13.02.2017.
 */
public class OperationDetailsPage extends AbstractPage{

    //Заголовок окна Детализация операции
    @NameOfElement("Заголовок окна Детализация операции")
    @FindBy(xpath = "//table/tbody/tr/td[contains(text(),\"Детализация операции:\")]")
    public SelenideElement title;

    //Вкладка Общая информация
    @NameOfElement("Вкладка Общая информация")
    @FindBy(xpath = "(//table/tbody/tr/td[text()=\"Общая информация\"])[1]")
    public SelenideElement mainInfoTab;

    //Заголовок раздела Общая информация
    @NameOfElement("Заголовок раздела Общая информация")
    @FindBy(xpath = "(//table/tbody/tr/td[text()=\"Общая информация\"])[2]")
    public SelenideElement mainInfoTitle;

    //Заголовок раздела Информация о платеже
    @NameOfElement("Заголовок раздела Информация о платеже")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Информация о платеже\"]")
    public SelenideElement payInfoTitle;

    //Заголовок раздела Информация о платежном средстве
    @NameOfElement("Заголовок раздела Информация о платежном средстве")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Информация о платежном средстве\"]")
    public SelenideElement meanInfoTitle;

    //Заголовок раздела Расчетные сведения (биллинг)
    @NameOfElement("Заголовок раздела Расчетные сведения (биллинг)")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Расчетные сведения (биллинг)\"]")
    public SelenideElement billingInfoTitle;

    //Заголовок раздела Прочая информация
    @NameOfElement("Заголовок раздела Прочая информация")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Прочая информация\"]")
    public SelenideElement otherInfoTitle;
}
