package org.example;


/**
 * OO 연구소는 한 번에 K 칸을 앞으로 점프하거나,
 * (현재까지 온 거리) x 2 에 해당하는 위치로 순간이동을 할 수 있는 특수한 기능을 가진 아이언 슈트를 개발하여 판매하고 있습니다
 * 이 아이언 슈트는 건전지로 작동되는데, 순간이동을 하면 건전지 사용량이 줄지 않지만, 앞으로 K 칸을 점프하면 K 만큼의 건전지 사용량이 듭니다.
 * 그러므로 아이언 슈트를 착용하고 이동할 때는 순간 이동을 하는 것이 더 효율적입니다.
 * 아이언 슈트 구매자는 아이언 슈트를 착용하고 거리가 N 만큼 떨어져 있는 장소로 가려고 합니다.
 * 단, 건전지 사용량을 줄이기 위해 점프로 이동하는 것은 최소로 하려고 합니다. 아이언 슈트 구매자가 이동하려는 거리 N이 주어졌을 때,
 * 사용해야 하는 건전지 사용량의 최솟값을 return하는 solution 함수를 만들어 주세요.
 *
 * 예를 들어 거리가 5만큼 떨어져 있는 장소로 가려고 합니다.
 * 아이언 슈트를 입고 거리가 5만큼 떨어져 있는 장소로 갈 수 있는 경우의 수는 여러 가지입니다.
 *
 * 처음 위치 0 에서 5 칸을 앞으로 점프하면 바로 도착하지만, 건전지 사용량이 5 만큼 듭니다.
 * 처음 위치 0 에서 2 칸을 앞으로 점프한 다음 순간이동 하면 (현재까지 온 거리 : 2) x 2에 해당하는 위치로 이동할 수 있으므로 위치 4로 이동합니다.
 * 이때 1 칸을 앞으로 점프하면 도착하므로 건전지 사용량이 3 만큼 듭니다.
 * 처음 위치 0 에서 1 칸을 앞으로 점프한 다음 순간이동 하면 (현재까지 온 거리 : 1) x 2에 해당하는 위치로 이동할 수 있으므로 위치 2로 이동됩니다.
 * 이때 다시 순간이동 하면 (현재까지 온 거리 : 2) x 2 만큼 이동할 수 있으므로 위치 4로 이동합니다. 이때 1 칸을 앞으로 점프하면 도착하므로 건전지 사용량이 2 만큼 듭니다.
 * 위의 3가지 경우 거리가 5만큼 떨어져 있는 장소로 가기 위해서 3번째 경우가 건전지 사용량이 가장 적으므로 답은 2가 됩니다.
 *
 * 제한 사항
 * 숫자 N: 1 이상 10억 이하의 자연수
 * 숫자 K: 1 이상의 자연수
 * */
public class JumpingAndTeleportation {

    int solution1(int n){

        //한번에 k칸을 앞으로 점프 || (현재까지 온 거리 )*2 위치로 순간이동
        //순간이동을 하면 건전지 사용량 줄지 x
        //K칸 점프하면 K만큼 건전지 사용량 감소
        //순간이동을 하는것이 효율적
        //거리가 N만큼 떨어져있는 장소로 가려고 한다.
        //점프로 이동하는 것은 최소

        //n이 홀수면 -1
        //n이 짝수면 /2

        int batteryCount = 0;

        while(n != 0){

            if(n % 2 == 0){
                //짝수
                n = n/2;
            }else{
                //홀수
                n -= 1;
                batteryCount++;
            }
        }

        return batteryCount;

    }


    //신박한 풀이
    //미췬....
    int solution2(int n){
        return Integer.bitCount(n);
    }

}
