import java.util.Scanner;

// 23,4,인텔리제이 갱신완료
//500원,100원,50원,10원 동전이있다. 거슬러줘야 할 돈이 N원일때 거슬러줘야할 동전의 최소 개수를 구하라.

//1. 받아야하는값 N
//2. 답변값 동전 개수.
//3. 최소 개수 -> GREEDY
//4. 가장 큰값인 500으로 나누고 그다음 100으로 나누고 50으로나누고 10으로 나누는것이 최소값이나온다.
//5. int 배열을 만들어놓고 for문으로 나누면 나오지않을까

public class left_Coin{
    public static void main(String[] args) {

        //1.받아야하는 값 N
        Scanner input = new Scanner(System.in); //input 이 N임
        int N = input.nextInt(); //int로 받을 때는 nextInt를 사용한다.
        int[] Coin_Array = {500,100,50,10}; //코인배열을 만든다.
        int Min_Coin = 0; //동전의 최고개수

        for (int i=0;i<Coin_Array.length; i++){  //for문으로 나눠본다 500부터
            Min_Coin += N/Coin_Array[i]; //N원을 500원부터 나누기. 즉 몫값
            N = N%Coin_Array[i]; //남은 N원은 나머지값.
        }
        System.out.println(Min_Coin); //최소개수출력

    }
}

//public class left_Coin {
//    public static void main(String[] args) {
//
//
//        Scanner input = new Scanner(System.in);
//
//        int coin = input.nextInt(); //ㄱ거슬러 줘야 할 돈
//
//        int[] coinArr = {500, 100, 50, 10};
//        int count =0;
//
//        for (int i = 0; i < coinArr.length; i++) {
//            //System.out.println(coinArr[i]);
//            count += coin/coinArr[i]; //코인의 개수 몫
//            coin = coin%coinArr[i]; //코인의 나머지 값.
//        }
//
//        System.out.println(count);
//
//    }
//}
