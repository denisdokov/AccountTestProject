package ru.paysecure.utils;

import com.github.kevinsawicki.http.HttpRequest;

/**
 * Created by ddokov on 09.02.2017.
 */
public class HttpOperations {

    public static String SilentPay(String url, String Merchant_ID, String OrderNumber, String OrderAmount, String OrderCurrency, String Language, String Delay, String Comment,
                          String Login, String Password, String TestMode, String Cardtype, String Cardnumber, String Expiremonth, String Expireyear, String Cardholder,
                          String Cvc2, String Clientip, String Lastname, String Firstname, String Middlename, String Email, String Address, String HomePhone, String Country,
                          String State, String City, String Zip, String Format, String Fax){

        String defaultURL;
        HttpRequest request = HttpRequest.get(url, true,
                "Merchant_ID", Merchant_ID,
                "OrderNumber", OrderNumber,
                "OrderAmount", OrderAmount,
                "OrderCurrency", OrderCurrency,
                "Language", Language,
                "Delay", Delay,
                "Comment", Comment,
                "Login", Login,
                "Password", Password,
                "TestMode", TestMode,
                "Cardtype", Cardtype,
                "Cardnumber", Cardnumber,
                "Expiremonth", Expiremonth,
                "Expireyear", Expireyear,
                "Cardholder", Cardholder,
                "Cvc2", Cvc2,
                "Clientip", Clientip,
                "Lastname", Lastname,
                "Firstname", Firstname,
                "Middlename", Middlename,
                "Email", Email,
                "Address", Address,
                "HomePhone", HomePhone,
                "Country", Country,
                "State", State,
                "City", City,
                "Zip", Zip,
                "Format", Format,
                "Fax", Fax);

        request.trustAllCerts();
        request.trustAllHosts();
        defaultURL = request.getConnection().getURL().toString();
        return defaultURL;
    }
}
