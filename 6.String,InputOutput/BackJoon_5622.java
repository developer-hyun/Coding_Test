import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int count =0;
        for(int i=0 ; i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch=='A' ||ch=='B'|| ch=='C') {
                count +=3;
                continue;
            }
            if(ch=='D' ||ch=='E'|| ch=='F') {
                count +=4;
                continue;
            }
            if(ch=='G' ||ch=='H'|| ch=='I') {
                count +=5;
                continue;
            }
            if(ch=='J' ||ch=='K'|| ch=='L') {
                count +=6;
                continue;
            }
            if(ch=='M' ||ch=='N'|| ch=='O') {
                count +=7;
                continue;
            }
            if(ch=='P' ||ch=='Q'|| ch=='R' || ch=='S') {
                count +=8;
                continue;
            }
            if(ch=='T' ||ch=='U'|| ch=='V') {
                count +=9;
                continue;
            }
            if(ch=='W' ||ch=='X'|| ch=='Y'|| ch=='Z') {
                count +=10;
            }
        }
        System.out.println(count);
    }
}
