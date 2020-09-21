package com.company;

public class Slovo {
    public static void main(String[] args) {
        String s = "This is a sample sentence.";
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");

        }
        int length = words.length;
        System.out.print(words[length - 2]);
    }
}
