import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int count =0;
        for(int i=0 ; i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch=='c') {
                if(i<str.length()-1) {
                    if(str.charAt(i+1) == '=') {
                        i++;
                    }
                    else if(str.charAt(i+1)=='-') {
                        i++;
                    }
                }
            }
            else if(ch=='d') {
                if(i<str.length()-1) {
                    if(str.charAt(i+1)=='z'){
                        if(i<str.length()-2) {
                            if(str.charAt(i+2)=='='){
                                i+=2;
                            }
                        }
                    }
                    else if(str.charAt(i+1)=='-'){
                        i++;
                    }
                }
            }
            else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {	// lj 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'n') {
                if(i < str.length()- 1) {
                    if(str.charAt(i + 1) == 'j') {	// nj 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// s= 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// z= 일 경우
                        i++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
