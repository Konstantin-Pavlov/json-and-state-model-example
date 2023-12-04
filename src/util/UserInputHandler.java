package util;

import exceptions.CustomException;

import java.util.Scanner;

class UserInputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int getAndCheckUserInput() {
        int input;
        while (true) {
            try {
                input = checkUserInput(scanner.nextLine());
            } catch (CustomException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("Try again: ");
                continue;
            }
            break;
        }
        return input;

    }

    private int checkUserInput(String strInput) throws CustomException, NumberFormatException {
        int intInput = 0;
        if (strInput.isBlank() || strInput.isEmpty()) {
            throw new CustomException("empty input");
        }
        try {
            intInput = Integer.parseInt(strInput);
        } catch (NumberFormatException e) {
            throw new CustomException("you should enter a number");
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
