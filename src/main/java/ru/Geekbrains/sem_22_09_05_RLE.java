package ru.Geekbrains;

public class sem_22_09_05_RLE {
    public static void main(String[] args) {
        String str = "aaaaabbbbbbcddddgvvvvvvvv";
        int count = 1;
        char curr = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (curr == str.charAt(i)) {
                count++;
            } else {
                if (count > 1){
                    sb.append(curr);
                    sb.append(count);
                } else {
                    sb.append(curr);
                }
                curr = str.charAt(i);
                count = 1;
            }
        }
        sb.append(curr);
        sb.append(count);
        System.out.println(sb);
    }
}