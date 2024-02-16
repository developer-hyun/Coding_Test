import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Snake {

    //뱀이 사과를먹으면 길이가 늘어나며 벽 또는 자기자신의 몸과 부딕히면 게임이 끝난다.
    //N크기의 정사각 보드위에서 진행 보드의 상하좌우 끝에는 벽이있다. 시작은 맨위 맨 좌측에 시작하여 길이는 1이다. 오른쪽으로 향한다.
    //뱀의 규칙  1. 뱀은 우선 머리를 다음칸에 위치시킨다.
    // 2. 이동한 칸에 사과가 있다면 칸에있던 사과가 없어지고 꼬리는 움직이지 않는다.
    // 3. 이동한 칸에 사과가 없다면 몸길이를 줄여 꼬리가 위치한 칸을 비워준다. = 몸길이는 그대로

    //첫째줄에는 보드 N는 2 ~ 100  사과 K는 0 ~ 100개
    //K개의 줄에는 사과의 위치가 주어지며 첫번째 정수는 행 두번째는 열을 의미한다.
    //다음줄에는 뱀의 방향변환 횟수 L
    //다음 L개의 줄에는 밤의 방향변환 정보가 주어지는데 정수 X와 문자 C로 되어있으며 게임시작 시간으로부터 X초가 끝난뒤에 왼쪽(C가 L)또는 오른쪽 (C가 D)으로 90도 방향을 회전시킨다는뜻 X는 1000이하

    //ex )
    //6    //보드 N
    //3    //사과 K
    //3 4   // 사과의 위치 3행 4열
    //2 5   // 사과의 위치
    //5 3    //사과의 위치
    //3  //L개
    //3 D //3초뒤 오른쪽
    //15 L  //15초뒤 왼쪽
    //17 D //17초뒤 오른쪽


    public static int[][] map = new int[101][101]; //맵의 전체 크기
    public static int N,K,L; //보드의 크기, 사과의 개수 , 방향전환개수
    public static ArrayList<Snake_Change_Node> Change_Direction = new ArrayList<>(); //3초 d와 같은 정보를 저장하는 배열
    public static int[] move_x = {0,1,0,-1}; //뱀이 동쪽을 시작으로 움직인다. 움직일때 방향에 따라 x,y좌표가 이동된다
    public static int[] move_y = {1,0,-1,0};


    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine()); //보드
        K = Integer.parseInt(bf.readLine()); //사과개수


        for(int i=0 ; i<K; i++) {
            StringTokenizer st= new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1; //map에서 1은 사과의 개수다.
        }

        L = Integer.parseInt(bf.readLine());
        for( int i=0 ; i<L ; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);  //direction이라는 배열을 만들어서 넣어보려고하였으나 생각해보니 하나는 int고 하나는 char여서
            //따로 Snake_Node를 만들어서 넣는다.
            Change_Direction.add(new Snake_Change_Node(x,c));
        }

        int head_x = 1; //뱀의 머리위치
        int head_y=1; //뱀의 머리위치
        map[head_x][head_y]=2; //뱀이있는 위치는 2

        //뱀이있는 현재 위치를 저장할 배열이 필요하다. 뱀을 담는 배열에서 먼저들어온곳이 먼저 빠져나가야하기때문에 우선순위큐가 필요하다. x,y좌표를 담아야하기 때문에 새로운 노드도 필요
        Queue<Snake_Location_Node> q = new LinkedList<>();
        q.offer(new Snake_Location_Node(head_x,head_y));

        //동서남북을 나타내는 숫자 변수가 필요하다
        int num_direction=0;




        while (true) {
            //뱀이 이동을 하기때문에 이동에 필요한 x,y좌표가 필요하다.
            int nx = head_x + move_x[num_direction];
            int ny = head_y + move_y[num_direction];

            if()

        }

    }

}
class Snake_Change_Node {
    private int time;
    private char direction;

    public Snake_Change_Node(int time,char direction) {
        this.time = time;
        this.direction = direction;
    }

    public int getTime() {
        return this.time;
    }

    public char getDirection() {
        return direction;
    }
}

class Snake_Location_Node {
    private int x;
    private  int y;

    public Snake_Location_Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

//    public static int[][] map = new int[101][101]; //전체 맵
//    public static int N,K;
//    public static int L;
//  //  public static int[][] direction = new int[101][101];
//    public static ArrayList<Snake_Node> direction = new ArrayList<>(); //3초 d와 같은 방향 정보 저장
//    //상하좌우로 움직일때 바뀌는 x,y좌표를 미리 저장해두어 계산한다. 동쪽먼저(동쪽으로 움직이기때문)
//    public static int[] dx = {0 , 1 , 0 ,-1} ;
//    public static int[] dy = {1, 0 , -1, 0};
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(bf.readLine()); //보드
//        K = Integer.parseInt(bf.readLine()); //사과개수
//
//        int[] apple = new int[K];
//        for(int i=0 ; i<K; i++) {
//            StringTokenizer st= new StringTokenizer(bf.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            map[a][b] = 1;
//        }
//
//        //L입력
//        L = Integer.parseInt(bf.readLine());
//        for( int i=0 ; i<L ; i++) {
//            StringTokenizer st = new StringTokenizer(bf.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            char c = st.nextToken().charAt(0);  //direction이라는 배열을 만들어서 넣어보려고하였으나 생각해보니 하나는 int고 하나는 char여서
//            //따로 Snake_Node를 만들어서 넣는다.
//            direction.add(new Snake_Node(x,c));
//        }
//
//        //사과정보랑 회전정보는 저장!
//        int head_x = 1;
//        int head_y = 1; //시작 좌표 및 뱀의 머리 위치
//        map[head_x][head_y] =2; //뱀이있는위치는 2로 저장
//
//        int time =0 ; //초를 저장 시간
//        int direction = 0; //뱀이 바라보고있는 방향
//
//        //뱀의 위치정보가 필요하다.(차지하고있는) //움직일때 꼬리좌표가없어지고 머리좌표가 추가되기때문에 큐가유리.
//        Queue<Position> q = new LinkedList<>();
//        q.offer(new Position(head_x,head_y));
//
//        while (true) {
//            int nx = head_x + dx[direction]; //이동은 맨처음에 동쪽으로한다. 이동할 x좌표
//            int ny = head_y + dy[direction]; //이동은 맨처음에 동쪽으로한다. 이동할 y좌표
//            if(nx >=1 && nx <=N && ny>=1 && ny <=N && map[nx][ny] !=2)  {   //nx좌표는 1 ~ N까지 ny좌표는 1 ~ N까지 (보드크기)  , 뱀과부딪치면안됨
//
//                //사과가 없으면 꼬리를 줄인다 한칸 전진한다
//                if(map[nx][ny] == 0 ) {
//                    map[nx][ny] =2 ; //뱀 한칸전진
//                    q.offer(new Position(nx,ny)); //전진한 뱀의 위치를 저장한다
//                    Position pre_pos = q.poll();  //꼬리를 줄였음으로 꼬리를 뺀다
//                    map[pre_pos.getX()][pre_pos.getY()] =0; //꼬리를 줄였음으로 map에서 뱀을 뺀다
//                }
//
//                //사과가 있으면 사과를 먹고 꼬리가 그대로이다.
//                if(map[nx][ny] ==1) {
//                    map[nx][ny]=2; //뱀 한칸 전진
//                    q.offer(new Position(nx,ny)); //전진한 뱀의 위치를 저장한다
//                }
//
//            }
//            //뱀이 밖으로 나가거나 벽에 부딪히거나  몸통에 부딪힌다면
//            else {
//                time +=1;
//                break; //끝
//            }
//
//            head_x = nx; //현재 머리의 위치
//            head_y = ny;
//            time +=1;
//
//            if()
//
//        }
//
//
//
//
//
//
//    }
//
//    //회전 방향 반환함수
//    public static int turn(int direction , char c) {
//        if ( c == 'L') {
//
//            if ( direction ==0 ) {
//                direction =3;
//            }
//            else {
//                direction -=1;
//            }
//        }
//        else {
//            direction = (direction +1) %4 ;
//        }
//        return direction;
//    }
//}
//
//class Snake_Node {
//
//    private int time;
//    private char direction;
//
//    public Snake_Node(int time,char direction ) {
//        this.time = time;
//        this.direction = direction;
//    }
//
//    public int getTime() {
//        return this.time;
//    }
//    public char getDirection() {
//        return this.direction;
//    }
//}
//
//class Position {
//
//    private int x;
//    private int y;
//
//    public Position(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return this.x;
//    }
//
//    public int getY() {
//        return this.y;
//    }
//}
//

