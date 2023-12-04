package util;

import exceptions.CustomException;

public class Printer {
    public void gerTruckInfo() {
        UserInputHandler inputHandler = new UserInputHandler();
        int userInput = 0;
        System.out.print("enter the truck id (1-3) to see info: ");
        while (true) {
            try {
                userInput = inputHandler.askForTruckId();
            } catch (CustomException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("Try again: ");
                continue;
            }
            break;
        }
        System.out.println(userInput);

    }
}
