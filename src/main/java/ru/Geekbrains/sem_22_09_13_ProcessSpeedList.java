package ru.Geekbrains;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class sem_22_09_13_ProcessSpeedList {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>(List.of(1,2,3,4,5,6));
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listInt.add(listInt.size() / 2, i);
        }
        System.out.println("ArrayList");
        System.out.println(System.currentTimeMillis() - s);

        LinkedList<Integer> linkInt = new LinkedList<>();
        long ss = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkInt.add(linkInt.size() / 2, i);
        }
        System.out.println("LinkedList");
        System.out.println(System.currentTimeMillis() - ss);
    }
}
