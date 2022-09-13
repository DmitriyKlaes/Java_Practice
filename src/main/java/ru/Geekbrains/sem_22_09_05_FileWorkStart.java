package ru.Geekbrains;

import java.io.*;

public class sem_22_09_05_FileWorkStart {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        try (PrintWriter wr = new PrintWriter(file)) {
            wr.println("aaa");
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}