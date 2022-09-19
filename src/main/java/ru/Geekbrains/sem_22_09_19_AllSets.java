package ru.Geekbrains;

/*
1. Создайте HashSet, заполните его следующими числами:
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами:
{1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

3. Создайте TreeSet, заполните его следующими числами:
{1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
*/

import java.util.*;

public class sem_22_09_19_AllSets {
    public static void main(String[] args) {
        Set<Integer> integerHashSet = new HashSet<>(List.of(10, 2, 3, 2, 4, 5, 6, 3));
        for (Integer integer : integerHashSet) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.println();
        Set<Integer> integerLinkedHashSet = new LinkedHashSet(List.of(10, 2, 3, 2, 4, 5, 6, 3));
        for (Integer integer : integerLinkedHashSet) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.println();
        Set<Integer> integerSet = new TreeSet<>(List.of(10, 2, 3, 2, 4, 5, 6, 3));
        for (Integer integer : integerSet) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }
}
