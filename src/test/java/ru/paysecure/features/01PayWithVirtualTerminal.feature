@smoketest
  Feature: Проведение платежей через виртуальный терминал

    Scenario: Совершение MOTO - платежа

      Given открыть account.paysecure.ru
      And проверить, что элемент с именем "Заголовок страницы" отображается в "Главное меню"
      And проверить, что элемент с именем "Вкладка виртуального терминала" отображается в "Главное меню"
      When кликнуть по элементу с именем "Вкладка виртуального терминала" в "Главное меню"
      Then проверить, что элемент с именем "Заголовок виртуального терминала" отображается в "Раздел виртуального терминала"
      And выбрать элемент "$Предприятие" из выпадающего списка "Список предприятий" в "Раздел виртуального терминала"
      When кликнуть по элементу с именем "Кнопка Далее" в "Раздел виртуального терминала"
      Then проверить, что элемент с именем "Ручной ввод в отсутствии клиента (MOTO)" отображается в "Форма виртуального терминала"
      And кликнуть по элементу с именем "Ручной ввод в отсутствии клиента (MOTO)" в "Форма виртуального терминала"
      And ввести в поле с именем "Номер заказа" текст: "$Номер заказа" в "Форма виртуального терминала"
      And ввести в поле с именем "Сумма" текст: "$Сумма" в "Форма виртуального терминала"
      And выбрать элемент "$Валюта" из выпадающего списка "Валюта" в "Форма виртуального терминала"
      And ввести в поле с именем "E-mail" текст: "$E-mail" в "Форма виртуального терминала"
      And выбрать элемент "$Язык" из выпадающего списка "Язык" в "Форма виртуального терминала"
      And ввести в поле с именем "Комментарии" текст: "$Комментарии" в "Форма виртуального терминала"
      And ввести в поле с именем "Фамилия" текст: "$Фамилия" в "Форма виртуального терминала"
      And ввести в поле с именем "Имя" текст: "$Имя" в "Форма виртуального терминала"
      And ввести в поле с именем "Отчество" текст: "$Отчество" в "Форма виртуального терминала"
      And выбрать элемент "$Тип" из выпадающего списка "Тип" в "Форма виртуального терминала"
      And ввести в поле с именем "Номер карты" текст: "$Номер карты" в "Форма виртуального терминала"
      And выбрать элемент "$Месяц" из выпадающего списка "Месяц" в "Форма виртуального терминала"
      And выбрать элемент "$Год" из выпадающего списка "Год" в "Форма виртуального терминала"
      And ввести в поле с именем "Держатель" текст: "$Держатель" в "Форма виртуального терминала"
      And ввести в поле с именем "CVV" текст: "$CVV" в "Форма виртуального терминала"
      When нажать по элементу с именем "Кнопка Оплатить"
      Then ?????

