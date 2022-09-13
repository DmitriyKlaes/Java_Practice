package ru.Geekbrains;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class sem_22_09_05_FileWork_Test_x_100 {
    public static void main(String[] args) {
        StringBuilder newStr = new StringBuilder();
        String test = "test ";
        int count = 100;
        for (int i = 0; i < count; i++) {
            newStr.append(test);
        }
        File file = new File("Test_x_100.txt");
        try (PrintWriter wr = new PrintWriter(file)) {
            wr.println(newStr);
        } catch (IOException ex) {
            ex.getLocalizedMessage();
        }
    }
}