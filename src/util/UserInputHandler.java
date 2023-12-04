package util;

import exceptions.CustomException;

import java.util.Scanner;

public class UserInputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public void askForTruckId() {
        System.out.print("enter the truck id (1-3) to see info: ");
        int userInput;
        try {
            userInput = checkUserInput(scanner.nextLine());
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

    private int checkUserInput(String strInput) throws CustomException {
        int intInput = 0;
        if (strInput.isBlank() || strInput.isEmpty()) {
            throw new CustomException("empty input");
        }
        try {
            intInput = Integer.parseInt(strInput);
        } catch (NumberFormatException e) {
            System.out.println("you should enter a number");
        }
        if (intInput < 1 || intInput > 3) {
            throw new CustomException("you should enter a number for 1 to 3");
        }
        return intInput;
    }

    public void closeUserInput() {
        scanner.close();
    }
}
