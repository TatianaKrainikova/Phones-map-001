package views;

import models.AppModel;
import utils.OptionValidator;

import java.util.Scanner;

public class AppView {

    AppModel model;
    Scanner scanner;
    int choice;

    public AppView(AppModel model) {
        this.model = model;
    }

    public int doChoice() {
        int option;
        scanner = new Scanner(System.in);

        System.out.println("""
                -------------------------
                Choose an option:
                1 - Create a contact.
                2 - View contacts.
                0 - Close the application.
                """);

        choice = OptionValidator.validateOption(scanner);
        model.setChoice(choice);
        option = model.getChoice();

        return option;
    }
}
