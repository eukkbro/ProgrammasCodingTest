package org.example;


/**
 * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고
 * 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
 *
 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만,
 * 전체 카펫의 크기는 기억하지 못했습니다.
 *
 * Leo가 본 카펫에서 갈색 격자의 수 brown,
 * 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를
 * 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.*/

public class Carpet {

    int[] solution1(int brown, int yellow){

        // hint1 : 격자 전체의 합은 갈색과 노란색의 합이다.
        // hint2 : width-2 * height*2 = 노란색이다.
        // hint3 : width >= height

        int total = brown + yellow;

        for(int height = 3; height <= total; height++){

            //나누어떨어지면 정수형태의 순서쌍임
            if(total % height == 0){

                int width = total / height;

                //두번째 힌트의 조건과
                //세번째 힌트의 조건을 만족하면 리턴
                /**오타났었다. 주의*/
                if( width >= height && (width-2)*(height-2) == yellow){
                    return new int[] {width, height};
                }

            }

        }

        return new int[0];
    }

}
