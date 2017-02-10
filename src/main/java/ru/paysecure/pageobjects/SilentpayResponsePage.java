package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 10.02.2017.
 */
public class SilentpayResponsePage extends AbstractPage{

    //Billnumber
    @NameOfElement("billnumber")
    @FindBy(xpath = "//result/orders/order/billnumber")
    public SelenideElement billnumber;
}
