package ru.Geekbrains;

/*
Взять набор строк, например,
Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class sem_22_09_15_TreeMapVerse {
    public static void main(String[] args) {
        System.out.println(verse("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись."));
    }
    public static TreeMap<Integer, List<String>> verse (String str) {
        TreeMap<Integer, List<String>> stringIntegerTreeMap = new TreeMap<>();
        String[] strArray = str.replace(".", "").split(" ");
        for (String s : strArray) {
            int length = s.length();
            if (stringIntegerTreeMap.containsKey(length)) {
                stringIntegerTreeMap.get(length).add(s);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                stringIntegerTreeMap.put(length, temp);
            }
        }
        return stringIntegerTreeMap;
    }
}
