package ua.kpi.fel;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Controller {
    private Notebook model;
    private View view;

    public Controller(Notebook model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runProcess() {
        model.setName(checkInputDataWithRegex(View.INPUT_NAME, RegexConstants.name));
        model.setSurname(checkInputDataWithRegex(View.INPUT_SURNAME, RegexConstants.surname));
        model.setNickName(checkInputDataWithRegex(View.INPUT_NICK_NAME, RegexConstants.nickName));
        model.setPhoneNumber(checkInputDataWithRegex(View.INPUT_PHONE_NUMBER, RegexConstants.phoneNumber));
        model.setEmail(checkInputDataWithRegex(View.INPUT_EMAIL, RegexConstants.email));
        model.setDateOfCreation(LocalDateTime.now());
        model.setFullName();
        HandlingNotUniqueExceptions();
    }

    public void HandlingNotUniqueExceptions() {
        while (true) {
            try {
                model.createNote();
                break;
            } catch (EmailNotUniqueException e) {
                System.out.println(e.getMessage());
                model.setEmail(checkInputDataWithRegex(View.INPUT_EMAIL, RegexConstants.email));
            } catch (NickNameNotUniqueException e) {
                System.out.println(e.getMessage());
                model.setNickName(checkInputDataWithRegex(View.INPUT_NICK_NAME, RegexConstants.nickName));
            }
        }
    }

    public String checkInputDataWithRegex(String message, String regex) {
        String result;
        Scanner scanner = new Scanner(System.in);
        view.printMessage(message);
        while(!(scanner.hasNext() && (result = scanner.nextLine()).matches(regex))) {
            wrongInputInstructions(message);
        }
        return result;
    }


    private void wrongInputInstructions(String message) {
        view.printMessage(View.WRONG_INPUT);

        switch (message) {
            case View.INPUT_NAME:
                view.printMessage(View.WRONG_INPUT_NAME);

                break;
            case View.INPUT_SURNAME:
                view.printMessage(View.WRONG_INPUT_SURNAME);

                break;
            case View.INPUT_NICK_NAME:
                view.printMessage(View.WRONG_INPUT_NICK_NAME);

                break;
            case View.INPUT_PHONE_NUMBER:
                view.printMessage(View.WRONG_INPUT_PHONE_NUMBER);

                break;
            case View.INPUT_EMAIL:
                view.printMessage(View.WRONG_INPUT_EMAIL);

                break;
        }
    }

}
