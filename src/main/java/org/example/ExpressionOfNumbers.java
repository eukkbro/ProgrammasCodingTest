package org.example;

public class ExpressionOfNumbers {


    /**
     solution1
     이중포문으로 차근차근 찾기 **/
    int solution1(int n){

        int answer = 0;

        for(int i=1; i <= n; i++){
            int sum = 0;

            for(int j = i; j <= n; j++){

                sum += j;

                if(sum == n){
                    answer++;
                    break;
                }

                if(sum > n) break;

            }
        }

        return answer;

    } //solution1()


    /**
     * 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는
     * 주어진 홀수 약수의 개수와 같다는 자연수 정리 이용
     */
    int solution2(int n){

        int answer = 0;

        for(int i = 1; i <= n; i+=2){ // 홀수만 순회

            if(n % i == 0) { //홀수가 나머지가 없다 = 약수이다.
                answer++; //약수일때 answer 카운트 증가
            }
        }

        return answer;

    } //solution2

}
