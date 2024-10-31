package org.example;

import java.util.Arrays;

public class MaxAndMin {

    /**
     * 문제
     * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
     * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수,
     * solution을 완성하세요.
     * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
     *
     * 제한 조건
     * s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
     * */

    String solution1(String s) {

        //공백을 기준으로 쪼갠다.
        String[] stringArray = s.split(" ");
        int[] intArray = new int[stringArray.length];

        //스트링 배열을 순회해서 int 배열로 바꿉니다.
        for(int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        //max 값과 min 값을 구합니다.
        int max = Arrays.stream(intArray).max().getAsInt();
        int min = Arrays.stream(intArray).min().getAsInt();


        return min + " " + max;


    }

}
