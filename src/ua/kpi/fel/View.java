package ua.kpi.fel;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                    new Locale("en"));

    public static final String INPUT_NAME = "input.name";
    public static final String INPUT_SURNAME = "input.surname";
    public static final String INPUT_NICK_NAME = "input.nickName";
    public static final String INPUT_PHONE_NUMBER = "input.phoneNumber";
    public static final String INPUT_EMAIL = "input.email";
    public static final String WRONG_INPUT_NAME = "input.wrong.name";
    public static final String WRONG_INPUT_SURNAME = "input.wrong.surname";
    public static final String WRONG_INPUT_NICK_NAME = "input.wrong.nickName";
    public static final String WRONG_INPUT_PHONE_NUMBER = "input.wrong.phoneNumber";
    public static final String WRONG_INPUT_EMAIL = "input.wrong.email";
    public static final String WRONG_INPUT = "input.wrong.data";



    public void printMessage(String message){
        System.out.println(bundle.getString(message));
    }


}
