package org.example;

public class Main {
    public static void main(String[] args) {

        CorrectParentheses correctParentheses = new CorrectParentheses();

        String s = "()()";

        System.out.println(correctParentheses.solution1(s));

    }
}