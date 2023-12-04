package util;

import exceptions.CustomException;
import model.Truck;

public class Printer {
    public void gerTruckInfo(Truck[] trucks) {
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
        System.out.println(trucks[userInput]);



    }
}
