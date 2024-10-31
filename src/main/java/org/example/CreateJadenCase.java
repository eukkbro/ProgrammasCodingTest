package org.example;

/**
 * 문제
 * JadenCase란 모든 단어의 첫 문자가 대문자이고,
 * 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다.
 * (첫 번째 입출력 예 참고)
 * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 1 이상 200 이하인 문자열입니다.
 * s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
 * 숫자는 단어의 첫 문자로만 나옵니다.
 * 숫자로만 이루어진 단어는 없습니다.
 * 공백문자가 연속해서 나올 수 있습니다.*/

public class CreateJadenCase {

    //ex) "3people Unfollowed Me"
    String solution1(String s){

        StringBuilder answer = new StringBuilder();

        //1. 소문자로 바꾼 string 값을 쪼개서 배열에 담기, 공백은 살려서
        String[] words = s.toLowerCase().split(" ", -1);

        //2. 해당배열을 순회해서 단어가 공백이 아니면 맨앞에 글자를 대문자로 바꾸기
        for(int i = 0; i< words.length; i++){

            if(!words[i].isEmpty()){ //공백이 아닐때만 처리

                answer.append(Character.toUpperCase(words[i].charAt(0))) //첫글자 대문자처리
                .append(words[i].substring(1)); //나머지 글자 더하기

            }

        //3. 마지막 단어가 아니면 공백 추가하기
            if(i < words.length - 1){
                answer.append(" ");
            }
        } // for문 종료

        return answer.toString();
    }


}
