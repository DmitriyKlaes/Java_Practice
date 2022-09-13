package ru.Geekbrains;

/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
*/

public class sem_22_09_13_CLASS_StaskUseAnArray<T> {
    private T[] array;
    private int index;

    public sem_22_09_13_CLASS_StaskUseAnArray(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }
    public boolean empty() {
        return this.size() == 0;
    }
    public void push(T value) {
        this.array[index++] = value;
    }
    public T peek() {
        return this.array[index - 1];
    }
    public T pop() {
        return this.array[--index];
    }

    public static void main(String[] args) {
        sem_22_09_13_CLASS_StaskUseAnArray<String> lala = new sem_22_09_13_CLASS_StaskUseAnArray(100);
        lala.push("qwe1");
        lala.push("qwe2");
        lala.push("qwe3");
        System.out.println(lala.pop());
        System.out.println(lala.pop());
        System.out.println(lala.pop());
        System.out.println(lala.pop());
    }
}
