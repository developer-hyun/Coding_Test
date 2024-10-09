import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count=0;
        for(int i=0 ; i<N;i++) {
            String str = bf.readLine();
            int pre =0;
            boolean[] alpa = new boolean[26]; //소문자 체크
            for(int j=0 ; j<str.length(); j++){
                int now = str.charAt(j);
                if(pre !=now) {
                    if(alpa[now-'a']==false) { //소문자가 나오지 않은 문자인경우
                        alpa[now-'a']=true; //나왔다고 표시를해줌
                        pre=now;
                    }
                    else{ //소문자가 나온문자면 끝.
                        break;
                    }
                }
                else{
                    pre=now;
                }
                if(j==str.length()-1){ //break없이 마지막까지 진행되면 count++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
