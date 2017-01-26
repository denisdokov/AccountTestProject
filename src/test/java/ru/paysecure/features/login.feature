@logintest
Feature: login test #1, login to account.paysecure.ru

  Scenario: go through to button "Подтвердить"

    Given open account.paysecure.ru
    And check that element with name "Заголовок страницы" is displayed on "Cтраница входа"
    And type to input with name "Логин" text: "test1602rgk2" on "Cтраница входа"
    And type to input with name "Пароль" text: "test1602rgk3" on "Cтраница входа"
    When press button with text "Подтвердить" on "Cтраница входа"
    Then check that element with name "Заголовок страницы" is displayed on "Главная страница"

