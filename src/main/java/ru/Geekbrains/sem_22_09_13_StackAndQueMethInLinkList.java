package ru.Geekbrains;

import java.util.LinkedList;

/*
1) Написать метод, который принимает массив элементов,
помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов,
помещает их в очередь и выводит на консоль содержимое очереди.
*/

public class sem_22_09_13_StackAndQueMethInLinkList {
    public static void main(String[] args) {
        Object[] arr = {13, "dada", "netnet", 111};
        getForStack(arr);
        getForQue(arr);
    }
    static void getForStack(Object[] arr) {
        LinkedList linkList = new LinkedList<>();
        for (Object o : arr) {
            linkList.push(o);
        }
        linkList.pop();
        System.out.println(linkList);
    }
    static void getForQue(Object[] arr) {
        LinkedList que = new LinkedList<>();
        for (Object o : arr) {
            que.offer(o);
        }
        que.poll();
        System.out.println(que);
    }
}
