import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game_Develop {
    public static int x,y,start_direction,direction;
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static void trun(){
        direction -=1;
        if (direction<0) {
            direction = 3;
        }
    }

    //1. map의 크기 N과 M을 bufferedReader로 받는다.
    //2. 좌표 x,y 와 시작시 바라보는 방향 start_direction을 받는다.
    //3. map의 육지와 바다 구성을 이중 배열로 for문을 이용하여 받는다.
    //4. trun()이라는 메소드를 만들건데 해당 메소드는 방향(direction이라는변수)이 왼쪽으로 도니까
    // 실행시 마다 -1을 주어 왼쪽으로 도는 방향을 의미하게 되고 음수가 되면 3(서쪽)이 된다.

    //5. 조건이 가보지않은 방향이 있다면 한칸을 간다는것이다. 이걸 알기위해 일단 한칸을 전진 후 해당 칸이 갔는지안갔는지 확인하기위해
    //direction(방향)이 북쪽부터 0 이니까  해당 인덱스에 맞게
    //** 한칸을 전진하였다고 생각하고 x,y좌표(dx,dy)를 미리 설정해놓는다. **

    //6. 만약에 어떤 특정 칸에 도착하였다면 해당칸에 방문하였다는 표시가 필요하니 visit라는 맵사이즈와 같은 크기의 것을 만든다.
    //7. 최종결과를 위한 result_count를 만든다.
    //8. while문으로 (1)회전한다.  (2) 회전하고 전진한 x,y좌표를 수정한다.

    //9. 이동 가능한 조건은 한칸 움직인 칸이 visit가 0일것 , map이 0(육지)일것이다.
    //10. 이동가능하면 visit x y result_count를 수정해준다.  여기서 회전 수를 체크해주는 변수가 없으면 게속 돌기때문에 trun_count
    //라는 변수를 하나 만들고 이동이되면 0 으로해준다.

    //11. 만약 4방향을 돌았는데 trun_count=4 갈수있는 칸이 없으면 한칸뒤로간다. (시작좌표 - 바라보는방향좌표)
    //12. 뒤로 이동시 육지면 다시 1단계부터 시작  바다시 종료.





    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //기본선언
        StringTokenizer st = new StringTokenizer(bf.readLine()); //readline으로 한줄 입력받는데 StringToken은 공백단위로 끊어줌
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        x = Integer.parseInt(st.nextToken()); //시작 x좌표
        y = Integer.parseInt(st.nextToken());  //시작 y좌표
        start_direction = Integer.parseInt(st.nextToken()); //시작 바라보는 방향

        int[][] map = new int[N][M]; //맵의사이즈
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j=0; j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] visit = new int[N][M]; //방문 표시확인 처음생성되면 0
        visit[x][y] = 1; //방문하였으면 1로 표기
        int result_count = 1; //최종결과 시작좌표가 있기때문에 1로해줌
        int trun_count = 0 ;//없으면 왼쪽으로 계속 돌게됨

        while(true) {
            trun();
            int nx = x +dx[direction]; //한칸 이동했다고 생각
            int ny = y + dy[direction]; //한칸 이동했다고 생각
            if(visit[nx][ny] == 0 && map[nx][ny]==0) {  //이동가능
                visit[nx][ny] = 1;
                x =nx;
                y= ny;
                result_count +=1;
                trun_count =0;
            }
            else trun_count +=1; //이동불가

            if (trun_count ==4) { //4방향다 체크시
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (map[nx][ny]==0) { //뒤로한칸 이동가능하면 이동 후 다시 시작
                    x = nx;
                    y= ny ;
                }
                else break; //이동불가시 종료
                trun_count =0;
            }


        }
        System.out.println(result_count);




    }

//    public static int start_dotd;
//    public static int[] dx = {-1,0,1,0};
//    public static int[] dy = {0,1,0,-1};
//
//    public static void trun() {
//        start_dotd -=1;
//        if (start_dotd ==-1) {
//            start_dotd =3;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        //풀이방안
//        //1. NXM 입력받기 , 좌표 및 방향 입력받기 , 맵 육지,바다 입력받기, 방문한 좌표 저장하기  //여기서부터는 bufferReader라는것을 찾았다.
//        //2. 왼쪽으로 회전이 중요한데 이때 처음 바라보는 방향을 알 수 없기 때문에 -1 씩하여 왼쪽으로 회전한다 --> 회전이 4번되었을때는 어떻게 처리할까
//        //3.
//
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //기본 선언
//        String NM = bf.readLine(); //라인 단위로 받음
//        StringTokenizer st = new StringTokenizer(NM); //StringTokenizer는 공백단위로 문자를 끊어줌
//        int N = Integer.parseInt(st.nextToken()); //N X M크기 직사각형
//        int M = Integer.parseInt(st.nextToken());
//
//        //st = new StringTOK9!~~
//        st = new StringTokenizer(bf.readLine());
//        int start_dotx = Integer.parseInt(st.nextToken()); //시작 x좌표
//        int start_doty = Integer.parseInt(st.nextToken()); //시작 y좌표
//        start_dotd = Integer.parseInt(st.nextToken()); // 시작 바라보는 방향
//
//        int[][] map = new int[N][M];
//        for(int i=0; i<N;i++) {
//            st = new StringTokenizer(bf.readLine());
//            for (int j=0;j<M;j++){
//                map[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        System.out.println(start_dotd);
//        System.out.println(Arrays.deepToString(map));
//
//        int[][] visit = new int[N][M]; //방문한 좌표 체크
//        visit[start_dotx][start_doty] =1; //현재 위치 체크
//
//        int count = 1; //최종 방문 카운트 된 좌표
//        int trun_count = 0; //회전 횟수
//
//        while(true) {
//            trun(); //조건 1임. 왼쪽으로 회전한 상태.
//            int nx = start_dotx + dx[start_dotd];
//            int ny  = start_doty + dx[start_doty];
//            if (visit[nx][ny] ==0 && map[nx][ny] ==0) {
//                map[nx][ny] =1;
//                start_dotx = nx;
//                start_doty = ny;
//                count +=1;
//                trun_count = 0;
//            }
//            else trun_count +=1;
//            if(trun_count ==4) {
//                nx  = start_dotx - dx[start_dotd];
//                ny = start_doty - dx[start_doty];
//
//            if (map[nx][ny] ==0) {
//                start_dotx = nx;
//                start_doty = ny;
//            } }
//            else break;
//            trun_count =0;
//        }
//        System.out.println(count);
//    }
}
