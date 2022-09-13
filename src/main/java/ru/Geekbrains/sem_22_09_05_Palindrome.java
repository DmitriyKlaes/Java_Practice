package ru.Geekbrains;

public class sem_22_09_05_Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Не палиндром");
                return;
            }
        }
        System.out.println("Палиндром");
    }
}