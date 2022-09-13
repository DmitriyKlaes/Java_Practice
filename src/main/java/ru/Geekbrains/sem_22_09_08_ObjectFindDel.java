package ru.Geekbrains;

import java.util.ArrayList;

public class sem_22_09_08_ObjectFindDel {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("fdfsdfdsf");
        arr.add(23);
        arr.add("fdfsdfdsfdsf");
        arr.add(13);
        arr.add("fdfsdfd");
        arr.add(12);
        arr.add("fdfsdfsf");
        arr.add(2);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}