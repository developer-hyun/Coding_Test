import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coding_04_4_2 {
    //이코테 4챕터 4-2 시각  //백준 18312
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count=0;
        for(int i=0;i<=N;i++) {
            for(int j=0;j<60;j++) {
                for(int k=0;k<60;k++) { //String 으로 변환해서 contains로 하면 틀림
                    if(i % 10 == M || i / 10 == M || j% 10 == M || j / 10 == M || k % 10 == M || k / 10 == M) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
