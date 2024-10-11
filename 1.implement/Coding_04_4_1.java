import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coding_04_4_1 {
    //이코테 - 구현 - 4-1예제
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] plans = bf.readLine().split(" ");
        int x = 1, y = 1;
        // L, R, U, D에 따른 이동 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            // 이동 후 좌표 구하기
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동 수행
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }
}
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//        String[] strArr = bf.readLine().split(" ");
//        int x=1,y=1;
//        for(int i=0;i<strArr.length;i++){
//            String str = strArr[i];
//            if(str.equals("L")) {
//                if(y>1){
//                    y --;
//                }
//                else{
//                    continue;
//                }
//            }
//            if(str.equals("R")){
//
//                if(y<N){
//                    y++;
//                }
//                else {
//                    continue;
//                }
//            }
//            if(str.equals("U")) {
//                if(x>1) {
//                    x--;
//                }
//                else{
//                    continue;
//                }
//            }
//            if(str.equals("D")) {
//                if(x<N){
//                    x++;
//                }
//            }
//        }
//        System.out.println(x+" "+y);

