import java.util.Scanner;

public class left_Coin {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int coin = input.nextInt(); //ㄱ거슬러 줘야 할 돈

        int[] coinArr = {500, 100, 50, 10};
        int count =0;

        for (int i = 0; i < coinArr.length; i++) {
            //System.out.println(coinArr[i]);
            count += coin/coinArr[i]; //코인의 개수 몫
            coin = coin%coinArr[i]; //코인의 나머지 값.
        }

        System.out.println(count);

    }
}
