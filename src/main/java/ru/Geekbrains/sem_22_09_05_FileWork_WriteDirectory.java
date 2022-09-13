package ru.Geekbrains;

import java.io.File;
import java.io.PrintWriter;
import java.util.Objects;

public class sem_22_09_05_FileWork_WriteDirectory {
    public static void main(String[] args) {
        String path = "C:/Windows/";
        File dir = new File(path);
        File dst = new File("WriteDirectory.txt");
        try (PrintWriter pr = new PrintWriter(dst)){
            for (File file1 : Objects.requireNonNull(dir.listFiles())) {
                pr.println(file1.getName());
            }
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }
}