import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Adventurer_Guild {
    public static int[] Fear = new int[5];
    public static int Result;

    //N의 범위가 10만.  O(NlogN)
    //모험가가 N명 공포도가 X인 모험가는 무조건 X명 이상 모험가가 모여야함.  최대 몇개의 모험가 그룹을 만들수 있을까 , 모험가를 다 안넣어도됨
    //1. 최대 몇개 -> 그리디 추측
    //2. 가장 공포도가 낮은 사람을 기준으로 출발. 은 안된다. 2와3이있으면 인원이 3명이여야함.
    //3. 그렇다고 공포도가 높은 사람을 기준으로하면 예시가 4111이면 안됨.
    //4. 낮은 사람을 기준으로 출발하되 , 넣은 사람의 수가 공포도보다 같거나 커야지만 그룹생성가능
    //5.



    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());  //모험가 숫자
        StringTokenizer st= new StringTokenizer(bf.readLine()); //공포도 입력
        for ( int i=0; i<N;i++){
            Fear[i] = Integer.parseInt(st.nextToken()); // 배열에 집어넣기
        }
       // System.out.println(Arrays.toString(Fear));
        Arrays.sort(Fear);//정렬
        int Loc = 0;
        int Group=0;

        for(int j=0; j<N;j++){
            Loc +=1; //그룹에 사람넣기
            if ( Loc >= Fear[j]) {  //그룹 인원이 공포도와 같거나 크면 통과(그룹이 만들어짐)
                Group +=1;//한 그룹이 만들어짐
                Loc =0; //새로운 그룹 세팅
            }
        }
        System.out.println(Group);

    }
}
