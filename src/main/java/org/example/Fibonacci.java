package org.example;

import java.util.ArrayList;

/**
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
 *
 * 예를들어
 *
 * F(2) = F(0) + F(1) = 0 + 1 = 1
 * F(3) = F(1) + F(2) = 1 + 1 = 2
 * F(4) = F(2) + F(3) = 1 + 2 = 3
 * F(5) = F(3) + F(4) = 2 + 3 = 5
 * 와 같이 이어집니다.
 *
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 *
 * 제한 사항
 * n은 2 이상 100,000 이하인 자연수입니다.*/
public class Fibonacci {

    int solution1(int n){

        //피보나치 배열 만들기
        int[] fibonacci = new int[n+1];

        //F(0)값과 F(1)값을 배열에 추가
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i<=n; i++){
            //피보나치 수열 공식 이용
            //overflow를 방지하기 위해서 1234567로 나눈 나머지 값을 배열에 저장
            fibonacci[i] = ( fibonacci[i-1] + fibonacci[i-2] ) % 1234567;
        }

        //나머지 구하는 공식을 return에서 하지 않는 이유
        //overflow 방지
        //더해질수록 값이 커지므로 int로 감당을 못할 경우가 생김.
        return fibonacci[n];
    }

    //ArrayList 활용
    int solution2(int n){

        ArrayList<Integer> fibonacciArrayList = new ArrayList<>();

        //F(0)=0 과 F(1)=1 저장
        fibonacciArrayList.add(0);
        fibonacciArrayList.add(1);

        for(int i = 2; i<=n; i++){
            fibonacciArrayList.add((fibonacciArrayList.get(i-1) +
                    fibonacciArrayList.get(i-2))%1234567 );
        }

        return fibonacciArrayList.get(n);
    }

}
