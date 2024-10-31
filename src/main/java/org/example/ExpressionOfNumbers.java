package org.example;

public class ExpressionOfNumbers {


    /**
     * solution1
     * 이중포문으로 차근차근 찾기 **/
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

   

}
