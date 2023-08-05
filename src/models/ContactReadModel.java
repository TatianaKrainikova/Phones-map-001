package models;

import database.DataProvider;

import java.util.Map;

public class ContactReadModel {

    public Map<String, String> readContacts() {
        return DataProvider.getData();
    }
}
