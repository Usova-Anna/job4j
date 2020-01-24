package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEqual (String originText, String duplicateText) {
boolean rsl = true;
String[] origin = originText.split(" ");
String[] text = duplicateText.split(" ");
HashSet<String> check = new HashSet<>();
// for-each origin -> new HashSet.
        // for-each text -> hashSet.contains
        return rsl;
    }
}
