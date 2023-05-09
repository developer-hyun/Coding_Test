import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game_Develop {
    public static int start_dotd;
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static void trun() {
        start_dotd -=1;
        if (start_dotd ==-1) {
            start_dotd =3;
        }
    }

    public static void main(String[] args) throws IOException {

        //풀이방안
        //1. NXM 입력받기 , 좌표 및 방향 입력받기 , 맵 육지,바다 입력받기, 방문한 좌표 저장하기  //여기서부터는 bufferReader라는것을 찾았다.
        //2. 왼쪽으로 회전이 중요한데 이때 처음 바라보는 방향을 알 수 없기 때문에 -1 씩하여 왼쪽으로 회전한다 --> 회전이 4번되었을때는 어떻게 처리할까
        //3.


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //기본 선언
        String NM = bf.readLine(); //라인 단위로 받음
        StringTokenizer st = new StringTokenizer(NM); //StringTokenizer는 공백단위로 문자를 끊어줌
        int N = Integer.parseInt(st.nextToken()); //N X M크기 직사각형
        int M = Integer.parseInt(st.nextToken());

        //st = new StringTOK9!~~
        st = new StringTokenizer(bf.readLine());
        int start_dotx = Integer.parseInt(st.nextToken()); //시작 x좌표
        int start_doty = Integer.parseInt(st.nextToken()); //시작 y좌표
        start_dotd = Integer.parseInt(st.nextToken()); // 시작 바라보는 방향

        int[][] map = new int[N][M];
        for(int i=0; i<N;i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(start_dotd);
        System.out.println(Arrays.deepToString(map));

        int[][] visit = new int[N][M]; //방문한 좌표 체크
        visit[start_dotx][start_doty] =1; //현재 위치 체크

        int count = 1; //최종 방문 카운트 된 좌표
        int trun_count = 0; //회전 횟수

        while(true) {
            trun(); //조건 1임. 왼쪽으로 회전한 상태.
            int nx = start_dotx + dx[start_dotd];
            int ny  = start_doty + dx[start_doty];
            if (visit[nx][ny] ==0 && map[nx][ny] ==0) {
                map[nx][ny] =1;
                start_dotx = nx;
                start_doty = ny;
                count +=1;
                trun_count = 0;
            }
            else trun_count +=1;
            if(trun_count ==4) {
                nx  = start_dotx - dx[start_dotd];
                ny = start_doty - dx[start_doty];

            if (map[nx][ny] ==0) {
                start_dotx = nx;
                start_doty = ny;
            } }
            else break;
            trun_count =0;
        }
        System.out.println(count);
    }
}
