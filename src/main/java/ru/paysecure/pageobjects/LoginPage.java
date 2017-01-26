package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by ddokov on 25.01.2017.
 */
public class LoginPage extends AbstractPage {

    //Заголовок
    @NameOfElement("Заголовок страницы")
    @FindBy(xpath = "//*[@id='login']/table/tbody/tr/td[3]/h2")
    public SelenideElement title;

    //Поле ввода логина
    @NameOfElement("Логин")
    @FindBy(name = "j_username")
    public SelenideElement Login;

    //Поле ввода пароля
    @NameOfElement("Пароль")
    @FindBy(name = "j_password")
    public SelenideElement Password;

    //Кнопка "Подтвердить"
    @NameOfElement("Кнопка Подтвердить")
    @FindBy(name = "approve")
    public SelenideElement SubmitButton;
}
