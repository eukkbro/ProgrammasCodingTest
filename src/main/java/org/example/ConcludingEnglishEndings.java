package org.example;


import java.util.HashSet;
import java.util.Set;

/**
 * 문제 설명
 * 1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.
 *
 * 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
 * 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
 * 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
 * 이전에 등장했던 단어는 사용할 수 없습니다.
 * 한 글자인 단어는 인정되지 않습니다.
 * 다음은 3명이 끝말잇기를 하는 상황을 나타냅니다.
 *
 * tank → kick → know → wheel → land → dream → mother → robot → tank
 *
 * 위 끝말잇기는 다음과 같이 진행됩니다.
 *
 * 1번 사람이 자신의 첫 번째 차례에 tank를 말합니다.
 * 2번 사람이 자신의 첫 번째 차례에 kick을 말합니다.
 * 3번 사람이 자신의 첫 번째 차례에 know를 말합니다.
 * 1번 사람이 자신의 두 번째 차례에 wheel을 말합니다.
 * (계속 진행)
 * 끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.
 *
 * 사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때,
 * 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한 사항
 * 끝말잇기에 참여하는 사람의 수 n은 2 이상 10 이하의 자연수입니다.
 * words는 끝말잇기에 사용한 단어들이 순서대로 들어있는 배열이며, 길이는 n 이상 100 이하입니다.
 * 단어의 길이는 2 이상 50 이하입니다.
 * 모든 단어는 알파벳 소문자로만 이루어져 있습니다.
 * 끝말잇기에 사용되는 단어의 뜻(의미)은 신경 쓰지 않으셔도 됩니다.
 * 정답은 [ 번호, 차례 ] 형태로 return 해주세요.
 * 만약 주어진 단어들로 탈락자가 생기지 않는다면, [0, 0]을 return 해주세요.*/
public class ConcludingEnglishEndings {

    int[] solution1(int n, String[] words) {

        //중복을 허용하지 않기 위해 Set 자료구조를 사용
        //HashSet으로 빠르게 파악하기
        Set<String> usedWords = new HashSet<String>();
        usedWords.add(words[0]); // 첫번째 값 넣기

        for(int i = 1; i < words.length; i++) {

            String prevWord = words[i-1];
            String currentWord = words[i];

            // 규칙 위반 체크
            if(usedWords.contains(currentWord) || prevWord.charAt(prevWord.length()-1) != currentWord.charAt(0)) {

                int person = (i % n ) + 1 ; // 몇번째 사람인지
                int turn = (i / n) + 1 ; // 몇번째 차례인지

                return new int[]{person, turn};

            }else{ // 규칙 위반이 아니라면

                usedWords.add(currentWord);

            }

        }

        return new int[]{0,0};
    }

}
