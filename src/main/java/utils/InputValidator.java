package utils;

import java.util.Scanner;

public class InputValidator {

    public static double getValidDoubleValue(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input.replace(",", "."));
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid CGPA.");
            }
        }
    }


    public static int getValidPositiveInt(Scanner scanner) {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    break;
                } else {
                    System.err.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid positive integer.");
            }
        }
        return value;
    }


    public static String getValidName(Scanner scanner) {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (!name.isEmpty() && name.matches("^[a-zA-Z]+$")) {
                return name;
            } else {
                System.err.println("Invalid input. Please enter a valid name");
            }
        }
    }

}


