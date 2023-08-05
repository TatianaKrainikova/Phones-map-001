package database;

import database.entities.Contact;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

    static Map<String, String> map;

    public static Map<String, String> getData() {

        map = new HashMap<>();
        map.put("Alice", "055 123-2589");
        map.put("Bob", "088 369-2541");
        map.put("Denis", "055 099-2584");
        map.put("Tom", "055 661-2135");
        map.put("Samanta", "088 111-2233");

        return map;
    }

    public static Map<String, String> addData(Contact name, Contact phone) {
        getData();
        map.put(name.getName(), phone.getPhone());
        return map;
    }
}
