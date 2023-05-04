import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        //문제
        //8x8사이즈에 나이트가있다. 나이트는 L자로만 이동가능하다.
        //1. 수평으로 두칸 이동 후 수직으로 한칸
        //2. 수직으로 두칸 이동 후 수평으로 한칸
        //이때 나이트의 위치가 주어졌을때 나이트가 이동할 수 있는 경우의 수를 출력하라.
        // 행은 1~8  열은 a~h다.

        Scanner input = new Scanner(System.in);
        String dot = input.nextLine();

        int x = dot.charAt(0) - 48; //문자 1은 int 49다. //-'0'도 가능하다. 자동형변환을 이용한것.
        int y = dot.charAt(1) - 96; // 문자 a는 int 97이다.

       // System.out.println(x);
        //System.out.println(y);

        int Count = 0; //경우의 수
        int[][] Cases = {{-2,-1},{-2,1},{2,-1},{2,1},{-1,-2},{1,-2},{-1,2},{1,2}}; //8가지 경우의 수

        for (int i=0;i< Cases.length;i++){
            int dx =x;
            int dy =y;
            dx += Cases[i][0]; //경우의 수 에 따라 모든 경우의 수를 계산해본다.
            dy += Cases[i][1];

            if(dx <1 || dx >8 || dy <1 || dy>8) {  //좌표를 벗어나는 경우 -> 음수거나 8보다 크면 해당 경우의 수는 배제한다.
                continue;
            }
            Count +=1;
        }
        System.out.println(Count);




    }
}
