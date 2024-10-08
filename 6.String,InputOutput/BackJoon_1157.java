import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; //영어 개수
        String str = bf.readLine();
        for(int i=0; i<str.length();i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                arr[str.charAt(i) - 97]= arr[str.charAt(i) - 97]+1; //소문자면 char계산을 통해 해당 문자 +1
            }
            else {
                arr[str.charAt(i)-65] = arr[str.charAt(i)-65]+1; //대문자면 char계산을 통해 해당 문자+1
            }
        }
        int max=0;
        char ch = '?';
        for(int i=0; i<26; i++) {
            if(arr[i]>max) {
                max = arr[i];
                ch = (char)(i+65); //대문자로변경
            }
            else if(arr[i]==max) {
                ch='?';
            }
        }
        System.out.println(ch);
    }
}
