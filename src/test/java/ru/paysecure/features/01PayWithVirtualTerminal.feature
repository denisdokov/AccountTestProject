@smoketest
  Feature: Проведение платежей через виртуальный терминал

    Scenario: Совершение MOTO - платежа

      Given открыть account.t.paysecure.ru
      And проверить, что элемент с именем "Заголовок главной страницы" отображается в "Главное меню"
      And проверить, что элемент с именем "Вкладка виртуального терминала" отображается в "Главное меню"
      When кликнуть по элементу с именем "Вкладка виртуального терминала" в "Главное меню"
      Then проверить, что элемент с именем "Заголовок виртуального терминала" отображается в "Раздел виртуального терминала"
      And из выпадающего списка "Список предприятий" выбрать элемент "(772545)asix_tester" в "Раздел виртуального терминала"
      When кликнуть по элементу с именем "Кнопка Далее" в "Раздел виртуального терминала"
      Then проверить, что элемент с именем "Ручной ввод в отсутствии клиента (MOTO)" отображается в "Раздел виртуального терминала"
      And кликнуть по элементу с именем "Ручной ввод в отсутствии клиента (MOTO)" в "Раздел виртуального терминала"
      And ввести в поле с именем "Номер заказа" текст: "$Номер заказа" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Сумма" текст: "100" в "Раздел виртуального терминала (MOTO - платеж)"
      And из выпадающего списка "Валюта" выбрать элемент "RUB" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "E-mail" текст: "assistqa1@gmail.ru" в "Раздел виртуального терминала (MOTO - платеж)"
      And из выпадающего списка "Язык" выбрать элемент "Русский" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Комментарии" текст: "smoke motopay test" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Фамилия" текст: "Selenide" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Имя" текст: "Cucumber" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Отчество" текст: "Test" в "Раздел виртуального терминала (MOTO - платеж)"
      And из выпадающего списка "Тип" выбрать элемент "VISA" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Номер карты" текст: "4111111111111111" в "Раздел виртуального терминала (MOTO - платеж)"
      And из выпадающего списка "Месяц" выбрать элемент "Дек" в "Раздел виртуального терминала (MOTO - платеж)"
      And из выпадающего списка "Год" выбрать элемент "2020" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "Держатель" текст: "SER GAY" в "Раздел виртуального терминала (MOTO - платеж)"
      And ввести в поле с именем "CVV" текст: "123" в "Раздел виртуального терминала (MOTO - платеж)"
      When кликнуть по элементу с именем "Кнопка Оплатить" в "Раздел виртуального терминала (MOTO - платеж)"
      And проверить, что элемент с именем "Окно Идет оплата" отображается в "Раздел виртуального терминала (MOTO - платеж)"
      And подождать пока пропадет элемент "Окно Идет оплата" в "Раздел виртуального терминала (MOTO - платеж)"
      Then проверить, что элемент с именем "Сообщение Завершено успешно" отображается в "Раздел виртуального терминала (MOTO - платеж)"

    Scenario: Совершение POS - платежа

      Given открыть account.t.paysecure.ru
      And проверить, что элемент с именем "Заголовок главной страницы" отображается в "Главное меню"
      And проверить, что элемент с именем "Вкладка виртуального терминала" отображается в "Главное меню"
      When кликнуть по элементу с именем "Вкладка виртуального терминала" в "Главное меню"
      Then проверить, что элемент с именем "Заголовок виртуального терминала" отображается в "Раздел виртуального терминала"
      And из выпадающего списка "Список предприятий" выбрать элемент "(772545)asix_tester" в "Раздел виртуального терминала"
      When кликнуть по элементу с именем "Кнопка Далее" в "Раздел виртуального терминала"
      Then проверить, что элемент с именем "Ручной ввод в присутствии клиента (POS key entry)" отображается в "Раздел виртуального терминала"
      And кликнуть по элементу с именем "Ручной ввод в присутствии клиента (POS key entry)" в "Раздел виртуального терминала"
      And ввести в поле с именем "Номер заказа" текст: "$Номер заказа" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Сумма" текст: "100" в "Раздел виртуального терминала (POS - платеж)"
      And из выпадающего списка "Валюта" выбрать элемент "RUB" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "E-mail" текст: "assistqa1@gmail.ru" в "Раздел виртуального терминала (POS - платеж)"
      And из выпадающего списка "Язык" выбрать элемент "Русский" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Комментарии" текст: "smoke motopay test" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Фамилия" текст: "Selenide" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Имя" текст: "Cucumber" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Отчество" текст: "Test" в "Раздел виртуального терминала (POS - платеж)"
      And из выпадающего списка "Тип" выбрать элемент "VISA" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Номер карты" текст: "4111111111111111" в "Раздел виртуального терминала (POS - платеж)"
      And из выпадающего списка "Месяц" выбрать элемент "Дек" в "Раздел виртуального терминала (POS - платеж)"
      And из выпадающего списка "Год" выбрать элемент "2020" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "Держатель" текст: "SER GAY" в "Раздел виртуального терминала (POS - платеж)"
      And ввести в поле с именем "CVV" текст: "123" в "Раздел виртуального терминала (POS - платеж)"
      When кликнуть по элементу с именем "Кнопка Оплатить" в "Раздел виртуального терминала (POS - платеж)"
      And проверить, что элемент с именем "Окно Идет оплата" отображается в "Раздел виртуального терминала (POS - платеж)"
      And подождать пока пропадет элемент "Окно Идет оплата" в "Раздел виртуального терминала (POS - платеж)"
      Then проверить, что элемент с именем "Сообщение Завершено успешно" отображается в "Раздел виртуального терминала (POS - платеж)"


