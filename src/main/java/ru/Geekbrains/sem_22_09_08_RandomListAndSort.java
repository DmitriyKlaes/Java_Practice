package ru.Geekbrains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class sem_22_09_08_RandomListAndSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10));
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}