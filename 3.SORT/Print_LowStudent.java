import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student ( String name , int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Student ot) {  //Collentions.sort를 쓰기위해서는 comparable인터페이스가필요한데
        //compareable인터페이스를 쓰기 위해서는 compareTo를 오버라이드 해야한다. 이유 : 무엇을 기준으로 정렬할지가 필요하기때문에.
        if ( this.age > ot.age) {
            return 1;
        }
        return -1;
    }

}

public class Print_LowStudent {

    //N명의 학생정보
    //학생정보는 이름과 성적으로 구분
    //성적이 낮은 순서대로 학생의 이름을 출력


    public static void R_Sort(int[] arr , String[] arrS) {
        int tmp =0;

        for ( int i=0 ; i<arr.length ; i++) {

            for ( int j=i+1 ; j < arr.length ;j++ ) {
                if ( arr[i] > arr[j] ) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                    String tmep = arrS[i];
                    arrS[i] = arrS[j];
                    arrS[j] = tmep;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        ArrayList<Student> sud = new ArrayList<Student>();

        int[] arr = new int[N];
        String[] arrS = new String[N];
        for ( int i=0 ; i<N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
          //  arrS[i] = st.nextToken();
          //  System.out.println(arrS[i]);
           // arr[i] = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
         //   System.out.println(age);
            sud.add(new Student(name,age));
        }
        //R_Sort(arr,arrS);
        //System.out.println(Arrays.toString(arrS));
        //System.out.println(Arrays.toString(arr));
        Collections.sort(sud);
        for (int i = 0; i < sud.size(); i++) {
            System.out.print(sud.get(i).getName() + " ");
        }
    }
}
