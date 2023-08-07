package controllers;

import database.entities.Contact;
import models.ContactCreateModel;
import views.ContactCreateView;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ContactCreateController {

    ContactCreateModel model;
    ContactCreateView view;
    Contact contact;

    public ContactCreateController(ContactCreateModel model, ContactCreateView view) {
        this.model = model;
        this.view = view;
    }

    public void addContact() {
        contact = view.doInputs();
        model.createContact(contact);
        view.getOutput(readContacts(model.createContact(contact)));
    }

    public String readContacts(Map<String, String> map) {
        AtomicInteger count = new AtomicInteger(0);
        StringBuilder stringBuilder = new StringBuilder();
        map.forEach((key, value) ->
                stringBuilder.append(count.incrementAndGet())
                        .append(") ")
                        .append(key)
                        .append(" ")
                        .append(value)
                        .append("\n")
        );
        return stringBuilder.toString();
    }

    //TODO
}
