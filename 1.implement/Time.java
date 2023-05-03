import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N  = input.nextInt();
        int Count = 0;

        for (int i=0;i<N+1;i++){
            for (int j=0;j<60;j++){
                for(int k=0;k<60;k++){
                    if (String.valueOf(i).contains("3") || String.valueOf(j).contains("3") || String.valueOf(k).contains("3")) {
                        Count += 1;
                    }
                }
            }
        }
        System.out.println(Count);
    }


}
