package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 10.02.2017.
 */
public class RefundPage extends AbstractPage {

    //Заголовок окна
    @FindBy(xpath = "(//*[@id]/table/tbody/tr/td[text()=\"Возврат денег\"])[1]")
    public SelenideElement title;

    //Кнопка "Отменить заказы"
    @NameOfElement("Кнопка Отменить заказы")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Отменить заказы\"]")
    public SelenideElement refundButton;

    //Результат "Завершено Успешно"
    @NameOfElement("Результат завершено успешно")
    @FindBy(xpath = "//td/div[text()=\"Завершено успешно\"]")
    public SelenideElement okMessage;
}
