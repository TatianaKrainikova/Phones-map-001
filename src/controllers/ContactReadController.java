package controllers;

import models.ContactReadModel;
import utils.AppStarter;
import views.ContactReadView;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ContactReadController {

    ContactReadModel model;
    ContactReadView view;

    public ContactReadController(ContactReadModel model, ContactReadView view) {
        this.model = model;
        this.view = view;
    }

    public void getContacts() {
        view.getOutput(readContacts());
        restartApp();
    }

    public String readContacts() {
        Map<String, String> map = model.readContacts();
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

    private void restartApp() {
        AppStarter.startApp();
    }
}
