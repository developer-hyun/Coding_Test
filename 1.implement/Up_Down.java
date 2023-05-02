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
//        int[] Start_Dot = {1,1};
//        int[] End_Dot = {1,1};
        int x = 1; //최종 출력좌표
        int y = 1; // 최종 출력 좌표
        int[] Rule_Dot_X = {0,0,-1,1}; //LRUD에 따른 x좌표
        int[] Rule_DOt_Y = {-1,1,0,0}; // LRUD에 따른 y좌표
        String[] Rule_Arr = {"L","R","U","D"}; //비교할 계획서 배열
      //  System.out.println(Rule);
       // System.out.println(Rule[2]);
        for(int i=0;i<Rule.length;i++) {
            int dx = x; //처음부터 x랑y를 움직여버리면 정사각형틀을 벗어나는 경우를 확인하기 어렵기 때문에 변수를 하나 더 만듬
            int dy = y;
            for (int j=0 ; j< Rule_Arr.length;j++){
                if (Rule[i].equals(Rule_Arr[j])){
                    dx = dx + Rule_Dot_X[j]; //계획서에 나와있는 문자에 따라 x,y좌표를 이동시킴
                    dy = dy + Rule_DOt_Y[j];
                }
            }
            if (dx<1 || dx >N || dy<1 || dy>N) { //정사각형 틀을 벗어나는 경우에는 x,y좌표를 변경하지 않고 위로 보내고 안벗어나면 x랑y를 변경함
                continue;
            }

            x = dx;
            y = dy;
            System.out.println(x + "."+ y);
        }
        System.out.println(x + "."+ y);
    }
}
