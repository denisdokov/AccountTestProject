package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 09.02.2017.
 */
public class InfoPage extends AbstractPage {

    //Заголовок окна(окно результата)
    @NameOfElement("Заголовок Окна")
    @FindBy(xpath = "(//*[@id]/table/tbody/tr/td[text()=\"Сообщение\"])[1]")
    public SelenideElement title;

    //Текст сообщения об успешной операции (окно результата)
    @NameOfElement("Счет успешно выставлен")
    @FindBy(xpath = "//td[text()=\"Счёт успешно выставлен\"]")
    public SelenideElement okLabel;

    //Текст сообщения "Отчет заказан" (окно результата)
    @NameOfElement("Отчёт заказан")
    @FindBy(xpath = "//table/tbody/tr/td[contains(text(),\"Отчёт заказан.\")]")
    public SelenideElement okReportLabel;

    //Кнопка ОК (окно результата)
    @NameOfElement("Кнопка OK")
    @FindBy(xpath = "//td[@class]/div[text()=\"OK\"]")
    public SelenideElement okButton;
}
