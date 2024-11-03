package org.example;

import javax.swing.text.Caret;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       JumpingAndTeleportation jumpingAndTeleportation = new JumpingAndTeleportation();

        System.out.println("solution1 : " + jumpingAndTeleportation.solution1(5));
        System.out.println("solution1 : " + jumpingAndTeleportation.solution1(6));
        System.out.println("solution1 : " + jumpingAndTeleportation.solution1(5000));
        System.out.println("solution2 : " + jumpingAndTeleportation.solution2(5));
        System.out.println("solution2 : " + jumpingAndTeleportation.solution2(6));
        System.out.println("solution2 : " + jumpingAndTeleportation.solution2(5000));


    }
}