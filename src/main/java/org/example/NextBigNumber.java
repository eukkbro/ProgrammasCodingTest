package org.example;


/**
 * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
 *
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 * 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
 *
 * 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
 *
 * 제한 사항
 * n은 1,000,000 이하의 자연수 입니다.*/

public class NextBigNumber {

    int solution(int n){
        
        //n의 이진수에서 1의 개수를 세기
        int nCount = Integer.toBinaryString(n).replace("0","").length();

        //n보다 큰수중 작은수 정의
        int nextNumber = n+1;

        //해당조건이 맞을때까지 반복문 돌리기
        while(Integer.toBinaryString(nextNumber).replace("0","").length() != nCount){
            nextNumber++;
        }

        return nextNumber;

    }

}
