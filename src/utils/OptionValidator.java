package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionValidator {

    public static int validateOption(Scanner scanner) {

        int[] menuChoices = {0, 1, 2};
        int inputData;
        String str1 = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Constants.NAN_MSG, str);
        }
        inputData = scanner.nextInt();

       while (!contains(menuChoices, inputData)) {
           System.out.println(Constants.NO_SUCH_OPTION_MSG);
           while (!scanner.hasNextInt()) {
               try {
                   str1 = scanner.next().trim();
               } catch (InputMismatchException ime) {
                   System.out.printf(Constants.NAN_MSG, str1);
               }
           }
           inputData = scanner.nextInt();
       }
       return inputData;
    }

    public static boolean contains(final int[] array, final int value) {
        boolean result = false;
        for (int i : array) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
