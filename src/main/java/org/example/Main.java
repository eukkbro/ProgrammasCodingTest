package org.example;

import javax.swing.text.Caret;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Carpet carpet = new Carpet();

        System.out.println(Arrays.toString(carpet.solution1(10, 2)));
        System.out.println(Arrays.toString(carpet.solution1(8, 1)));
        System.out.println(Arrays.toString(carpet.solution1(24, 24)));


    }
}