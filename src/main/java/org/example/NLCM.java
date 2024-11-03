package org.example;

/**
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서,
 * n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 *
 * 제한 사항
 * arr은 길이 1이상, 15이하인 배열입니다.
 * arr의 원소는 100 이하인 자연수입니다.*/

public class NLCM {

    int solution1(int[] arr){

        //첫번째 숫자를 answer에 저장
        int answer = arr[0];

        // 두수를 끝까지 계속 계산
        for(int i = 1; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    //두 수의 최대공약수 구하는 함수
    private int gcd(int a, int b){

       while(b != 0){

           int temp = b; // 뒤에숫자를 따로빼놓고
           b = a % b; // b에다가 a를 b로 나눈 나머지 넣기
           a = temp; // a에 뒤에숫자 넣기

           // a를 b로 나눈 나머지가 b
           // 나눈숫자가 a

       }

       return a;

    }

    //두수의 최소공배수를 구하는 함수 (유클리드 호제법)
    //이건 그냥 외우자.
    //두수 a,b 가 주어졌을 때 최소공배수 = a * (b를 최대공약수로 나눈 값)
    private int lcm(int a, int b){
        return a * (b / gcd(a,b));
    }

}
