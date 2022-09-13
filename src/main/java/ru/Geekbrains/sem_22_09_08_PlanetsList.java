package ru.Geekbrains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class sem_22_09_08_PlanetsList {
    public static void main(String[] args) {
        List<String> planets = List.of("Венера", "Марс", "Земля", "Меркурий", "Сатурн", "Юпитер", "Нептун", "Уран");
        Random rd = new Random();
        ArrayList list = new ArrayList();
        int index;
        for (int i = 0; i < 15; i++) {
            index = rd.nextInt(7);
            list.add(planets.get(index));
        }
        int count = 0;
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            count++;
            if (!list.get(i).equals(list.get(i+1))) {
                System.out.printf(list.get(i) + " - " + count + "\n");
                count = 0;
            }
        }
        System.out.printf(list.get(list.size() - 1) + " - " + (count + 1) + "\n");

        int i = 0;
        while (i < list.size() - 1) {
            if (list.get(i).equals(list.get(i+1))) {
                list.remove(list.get(i));
            } else {
                i++;
            }
        }
        System.out.println(list);
    }
}
