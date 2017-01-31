package ru.paysecure.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddokov on 30.01.2017.
 */
public class VirtualTerminalPage extends AbstractPage {

    //Строка заголовка
    @NameOfElement("Заголовок виртуального терминала")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Виртуальный терминал\"]")
    public SelenideElement title;

    //Выпадающий список мерчантов
    @NameOfElement("Список предприятий")
    @FindBy(xpath = "//label[@id]/nobr[text()=\"Предприятие\"]/../following::td/table/tbody/tr/td/div[contains(@style, \"width:323px;height:12px\")]")
    public SelenideElement merchantComboBox;

    //Кнопка "Далее >"
    @NameOfElement("Кнопка Далее")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td/nobr[text()=\"Далее >\"]")
    public SelenideElement nextButton;

    //вкладка "Ручной ввод в отсутствии клиента (MOTO)"
    @NameOfElement("Ручной ввод в отсутствии клиента (MOTO)")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Ручной ввод в отсутствии клиента (MOTO)\"]")
    public SelenideElement motoTab;

    //Вкладка "Ручной ввод в присутствии клиента (POS key entry)"
    @NameOfElement("Ручной ввод в присутствии клиента (POS key entry)")
    @FindBy(xpath = "//div[@id]/table/tbody/tr/td[text()=\"Ручной ввод в присутствии клиента (POS key entry)\"]")
    public SelenideElement posTab;

}
