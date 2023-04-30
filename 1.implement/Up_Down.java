import java.util.Scanner;

public class Up_Down {
    public static void main(String[] args) {

       // 문제 : NXN크기의 정사각형이있다. 왼쪽위 좌표는 (1,1)이며 오른쪽 아래 좌표는 (N,N)이다.
        //계획서를 이용해 이동해야하며 L(왼쪽한칸) , R(오른쪽한칸) , U(위로한칸) , D (아래로한칸)이 써있다.
       // 단, 계획서에 써있더라도 NXN칸을 벗어나는것은 무시한다.   최종좌표를 출력하라.

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine(); //String 을 받는 nextLine은 이전에 받았던 수가 있다면 버퍼가남아있을수있기 때문에 해당코드로 비워줘야한다.
        String[] Rule = input.nextLine().split(" ");

        int[] Start_Dot = {1,1};
        int[] End_Dot = {1,1};

        int x = 1;
        int y = 1;

        int[] Rule_Dot_X = {0,0,-1,1};
        int[] Rule_DOt_Y = {-1,1,0,0};

        for(int i=0;i<Rule.length;i++) {

        }
    }
}
