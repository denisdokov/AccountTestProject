package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 10.02.2017.
 */
public class ApprovePage extends AbstractPage {
    //Заголовок окна
    @FindBy(xpath = "(//*[@id]/table/tbody/tr/td[text()=\"Подтверждение\"])[1]")
    public SelenideElement title;

    //Кнопка "Подтвердить заказы"
    @NameOfElement("Кнопка подтвердить заказы")
    @FindBy(xpath = "//table/tbody/tr/td[text()=\"Подтвердить заказы\"]")
    public SelenideElement refundButton;

    //Результат "Завершено Успешно"
    @NameOfElement("Результат завершено успешно")
    @FindBy(xpath = "//td/div[text()=\"Завершено успешно\"]")
    public SelenideElement okMessage;
}
