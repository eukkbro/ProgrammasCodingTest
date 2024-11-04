package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       ConcludingEnglishEndings concludingEnglishEndings = new ConcludingEnglishEndings();

       String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        System.out.println(Arrays.toString(concludingEnglishEndings.solution1(3, words)));


    }
}