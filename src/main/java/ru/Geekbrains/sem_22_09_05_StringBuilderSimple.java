package ru.Geekbrains;

public class sem_22_09_05_StringBuilderSimple {
    public static void main(String[] args) {
        int n = 4;
        char c1 = 'a';
        char c2 = 'b';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        System.out.println(sb);
    }
}
