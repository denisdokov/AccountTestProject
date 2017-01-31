package ru.paysecure.utils;

import java.util.Calendar;

/**
 * Created by ddokov on 30.09.2016.
 */
public class Generators {
    public static int numberCounter = 1;
    public static String curDate = Calendar.getInstance().getTime().toString();

    //Генератор номера (напримера Счета)
    public static String getNumber() {
        String number;
        number = curDate + '(' + numberCounter + ')';
        numberCounter++;
        return number;
    }
}
