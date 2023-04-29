import java.util.Arrays;
import java.util.Scanner;

public class Big_Number_Rule {

    //문제 : 배열이 있을때 주어진 수를 M번더하여 가장 큰수를 만드는데 K번을 초과할수없다.
    //ex) 2 4 5 4 6이면 M이 8 K가 3면 6 6 6 5 6 6 6 5임.
    //ex) 2 4 고 M이10 K가3 444 2 444 2 44.

    //풀이방법
    //1.N개수의 배열 입력받기 M번 입력받기 , K번 입력받기 , 배열초기값 만들기.
    //2. 가장 큰수를 만들어야하기 때문에 일단 정렬이필요함(배열)
    //3. 여기서 중요한건어차피 가장 큰수 2개만 사용한다는점.
    //4. K번을 초과할수없다는말은 k가 3이면 큰수+큰수+큰수+작은수 k가 1이면 큰수+작은수
    //   와 같이 K+1 개씩 반복됨. 즉 M을 K+1로 나눈 몫만큼 한세트가 반복되니
    //   몫만큼 K+1세트(큰수+큰수+ -- 작은수) 곱해주고
    //   나머지는 가장 큰수 * 나머지 해주면됨.
    //5.결과값확인
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //배열의 개수
        int M = input.nextInt(); //더하는 M번
        int K = input.nextInt(); //초과할수없는 K번
        int[] arr = new int[N]; //N사이즈의 배열
        System.out.println("배열을 입력하시오");

        for (int i=0;i<N;i++){
            arr[i] =input.nextInt(); //숫자배열 입력받기N개수만큼
        }

        Arrays.sort(arr); //배열 정렬하기
        int first_big = arr[N-1];//가장큰수
        int second_big = arr[N-2]; //두번째로 큰수
        int result_num = 0;// 더해진 최종값
       // System.out.println(first_big);
        //System.out.println(second_big);

        int set_num = (K *first_big) + second_big; //K+1개의 세트 숫자값.
        //System.out.println(set_num);
        result_num += (M/(K+1)) * set_num; //M나누기 K+1몫에다가 K+1세트 숫자값 곱해주기 0도가능
       // System.out.println(result_num);
        result_num += (M%(K+1)) * first_big; //나머지는 큰수밖에 안나와서 큰수만 곱해주기

        System.out.println(result_num); //결과값확인







    }


}
