package ru.Geekbrains;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
Нужно рассплитить строку по ~,
сохранить text в связный список на позицию num.
Если введено print~num,
выводит строку из позиции num в связном списке и удаляет её из списка.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class sem_22_09_13_SplitAndAddToList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String[] str = scanner.nextLine().split("~");
            int index = Integer.parseInt(str[1]);
            if (index > linkedList.size()) {
                System.out.println("Error out of bound");
                System.out.println("Repeat you value");
            } else {
                if (str[0].equalsIgnoreCase("print")) {
                    System.out.println(linkedList.get(index));
                    linkedList.remove(index);
                } else {
                    linkedList.add(index, str[0]);
                    System.out.println("Value add");
                }
            }
        }
    }
}
