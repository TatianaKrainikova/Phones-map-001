package utils;

import java.util.Scanner;

public class PhoneValidator {

    public static String validatePhoneInput(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println(Constants.PHONE_EMPTY_MSG);
            str = scanner.nextLine().trim();
        }
        return str;
    }
}
