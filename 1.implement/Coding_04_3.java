import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coding_04_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int Fx = Integer.parseInt(st.nextToken()); //북쪽으로 A칸
        int Fy = Integer.parseInt(st.nextToken()); //서쪽으로 A칸
        int dir = Integer.parseInt(st.nextToken());
        int[][] check = new int[N+2][M+2];
        int x = Fx+1; //코드에서 사용할 x좌표 Fx가 1,Fy가 1이라면 이제 캐릭터가 위치해있는좌표는 2,2임
        int y = Fy+1;
        check[x][y]=1; //현재위치 방문처리
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int dirNum =0; //회전한 횟수
        int count =1;//움직인횟수
        int[][] map = new int[N+2][M+2];
        for(int i=1;i<=N;i++) { //map정보저장
            st = new StringTokenizer(bf.readLine());
            for(int j=1;j<=M;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (true) {
            dir = Direction(dir);
            int nx = x + dx[dir]; //회전해서 앞으로간 x,y좌표
            int ny = y + dy[dir];
            if(map[nx][ny]==0 && check[nx][ny]==0) { //맵이 육지고 가본적이없다면
                check[nx][ny]=1; //방문표시
                x=nx;
                y=ny;
                count ++;
                dirNum=0;
                continue;
            }
            else { //맵이 바다거나 가본곳이면 회전해야함
                dirNum++;
            }
            if(dirNum==4) { //4방향이 다 움직일 수없다면 한칸 뒤로가야함
                nx = x - dx[dir];
                ny = y - dy[dir];
                if(map[nx][ny]==1){
                    break;
                }
                else {
                    x = nx;
                    y = ny;
                }
                dirNum=0;
            }
        }
        System.out.println(count);
    }
    public static int Direction(int i) {

        if(i==0) {
            return 3;
        }
        else {
            return i-1;
        }
    }
}
