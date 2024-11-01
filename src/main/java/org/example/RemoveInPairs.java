package org.example;

import java.util.Stack;
/**
 * 문제 설명
 * 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다.
 * 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
 * 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다.
 * 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
 * 문자열 S가 주어졌을 때,
 * 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요.
 * 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.
 *
 * 예를 들어, 문자열 S = baabaa 라면
 *
 * b aa baa → bb aa → aa →
 *
 * 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
 *
 * 제한사항
 * 문자열의 길이 : 1,000,000이하의 자연수
 * 문자열은 모두 소문자로 이루어져 있습니다.*/
public class RemoveInPairs {

    int solution1(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            // 스택이 비어있지 않고 최상단의 문자와 현재문자가 같다면 문자제거
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{ //그렇지 않다면 최상단에 ch push
                stack.push(ch);
            }

        }

        //스택이 비어있으면 문자들이 전부 제거됐다는 뜻이므로 return 1
        //스택이 비어있지 않으면 문자들을 전부 제거하지 못했으므로 return 0
        return stack.isEmpty() ? 1 : 0;
    }

}
