import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Coding_04_2 {
    //4챕터구현 2번 왕실의 나이트
    public static void main(String[] args) throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int x = str.charAt(1)-'0'; //x,y로 변환
        int y = str.charAt(0)-'a'+1;
        int Ox = x;
        int Oy = y;
        int[] dx = {-2,-2,-1,1,-1,1,2,2};  //L자로 움직일 수 있는 x,y좌표 설정
        int[] dy = {-1,1,-2,-2,2,2,-1,1};
        int count=0;
        for(int i=0 ; i<8;i++) {
            Ox += dx[i];
            Oy += dy[i];
            if(Ox<1 || Ox>8 || Oy<1 || Oy >8 ) {  //정답예제는 밖으로 나가는처리가 아니라 안에들어오는처리 ex)Ox>=1와 같이.
                Ox =x;
                Oy =y;
                continue;
            }
            Ox =x;
            Oy =y;
            count ++;
        }
        System.out.println(count);
    }
}
