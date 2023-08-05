package views;

import database.entities.Contact;
import models.ContactCreateModel;
import utils.NameValidator;
import utils.PhoneValidator;

import java.util.Scanner;

public class ContactCreateView {

    ContactCreateModel model;
    Contact contact;
    String title;
    Scanner scanner;

    public ContactCreateView(ContactCreateModel model) {
        this.model = model;
    }

    public Contact doInputs() {

        scanner = new Scanner(System.in);
        contact = new Contact();

        title = "Enter name: ";
        System.out.println(title);
        contact.setName(NameValidator.validateNameInput(scanner));

        title = "Enter phone: ";
        System.out.println(title);
        contact.setPhone(PhoneValidator.validatePhoneInput(scanner));

        return contact;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
