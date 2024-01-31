import java.util.Arrays;

public class Lock_And_Key {

    //튜브는 열쇠로 자물쇠를 열고자한다.
    //자물쇠는 NXN크기의 정사각 격자형태고 열쇠는 MXM크기의 정사각 격자형태이다.
    //열쇠의 돌기와 자물쇠의 돌기가 만나서는 안되며 자물쇠의 모든 홈을 채워야지 열린다.
    //열쇠를 나타내는 2차원 배열 key와 자물쇠를 나타내는 2차원배열 lock이 매개변수로 주어진다.
    //열쇠로 자물쇠를 열 수 있으면 true 없으면 false를 return하도록 하시오.
    //M은 3 ~ 20  N은 3 ~ 20   M은 N이하   key와 lock의 원소를 0과1이며 0은 홈부분 1은 돌기부분
    //O(N3)까지 가능??


    //생각
    //key와 lock을 더했을때 원소가 모두 1이되면 다 채워진것이다.
    //key를 돌린다고 하였기 때문에 4번의 회전이 필요하다.
    //key는 lock의 범위 밖을 나가도된다.
    //그러므로 lock을 확대하여 처음부터 돌며 4번의 회전을 하며 모든원소의 합이 1이 되는 경우가 있는지를 확인한다.
    //

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] key = {{0,0,0},{1,0,0},{0,1,1}};
        int[][] lock = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,0,0},{0,0,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
    //    int[][] lock = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(solution.check(lock));
      //  System.out.println(solution.solution(key,lock));
        //000000
        //000000
        //001100
        //001100
        //000000
        //000000
    }
}


class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;

        //1.키는 자물쇠의 범위를 벗어날수 있기 때문에 자물쇠를 3배늘려서 확인하는편이 낫다.
        int N = key.length;
        int M = lock.length;
        //자물쇠 3배확대
        int[][] big_lock = new int[M * 3][M * 3];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                big_lock[M + i][M + j] = lock[i][j];
            }
        }

        //4.키를 4방향씩 돌리며 자물쇠에 넣는다.
        for(int i=0 ;i<4 ; i++ ) {
            int[][] new_key = rotation(key);


            //큰 자물쇠는 0,0에서 시작한다.
            for( int j=0 ; j<N*3; j++) {  // for( int j=0 ; j<N*3; j++) {   //
                for(int k=0; k<N*3; k++) {  //  for(int k=0; k<N*3; k++) {

                    //자물쇠에 키를 넣어본다
                    for(int t=0; t<N;t++) {
                        for ( int y=0 ; y<N; y++) {
                            big_lock[j+t][k+y] += key[t][y];  //자물쇠에 키의 원소값을 추가한다 = 넣는다. 이때 큰자물쇠의for문을 j<N*3을 해주면 범위가넘어간다.(키의범위도있기때문에)
                        }
                    }

                }
            }
        }
        return true;
    }
//2.자물쇠의 0,0 부터시작하여 키를 4방향으로 돌리면서 확인해야하기때문에 90도씩 돌리는 함수가 필요하다.
    public static int[][] rotation(int[][] key) {
        int n = key.length;
        int m = key.length;
        int[][] new_key = key;

        for(int i=0 ; i<n; i++) {
            for (int j=0 ; j<m; j++) {
                //90도를 돌려야한다.  //돌리면 열이 행이된다. //이때 역순으로 들어가기때문에 n(기존행) - i(현재행)-1을 해줘야 역순이된다. //0,0은 0,3이되고 1,0은 0,1이되고 2,2는 2,0이됨
                new_key[j][n-i-1] = key[i][j];
            }
        }
        return new_key;
    }
    //3.키를 넣었을때 자물쇠가 전부다 1 인지 확인하는 부분이 필요하다.
    public static boolean check(int[][] big_lock) {
        int n = big_lock.length;
        int m = big_lock.length;

        for(int i = n/3 ; i<n/3*2 ; i++) {
            for(int j=n/3; j<n/3*2; j++) {
                if(big_lock[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

}

//3.키를 넣었을때 자물쇠가 전부다 1 인지 확인하는 부분이 필요하다.



























//        //우선 lock의 크기를 3배로 확대한다.
//        int N = key.length;
//        int M = lock.length;
//        int[][] big_lock = new int[M*3][M*3];
//        //확대한 lock에 기존 lock을 가운데로 넣는다.
//        for(int i=0; i<M; i++) {
//            for(int j=0 ; j<M; j++) {
//                big_lock[i+M][j+M] = lock[i][j];
//            }
//        }
//
//        //이제 key를 big_lock에 처음부터 4방향씩 회전하며 들어가는지 확인해야한다.
//        for(int rot =0 ; rot<4; rot++) { //4방향 돌리는 for문
//            key= rotation(key); //90도회전
//
//            //넓혀진 자물쇠에 처음부터 시작하여 기존자물쇠크기 x2까지 키를 넣을 준비를 한다.  M*2(기존자물쇠2배)인 이유는 시작점이 0,0이기때문에 M*2만해도 3배크기를 탐사할수있다.
//            for(int i=0 ; i<M*2; i++) {
//                for(int j=0 ; j<M*2 ; j++) {
//
//                    //키를 이제 자물쇠에 넣어서 기존 자물쇠가 모두 1이되면 true인것이다.
//                    for(int k=0 ; k<N; k++) {
//                        for(int z=0 ; z<N; z++) {
//                            //키를 자물쇠에 추가해본다.
//                            big_lock[i+k][j+z] += key[k][z];
//                        }
//                    }
//                    //자물쇠가 모두 1이면 딱 알맞는것이다.
//                    if(check(big_lock)) return true;
//
//                    //1이 아니라면 = 키가 맞지 않다면 다시 열쇠를 빼고 위로 보내야한다.
//                    for(int o=0 ; o<N;  i++) {
//                        for(int p=0 ; p<N; p ++) {
//                            big_lock[i+o][j+p] -= key[o][p];
//                        }
//                    }
//                }
//            }
//        }
//
//        return false;
//    }
//
//    //key를 4번돌려서 확인해야하기때문에 90도씩 돌리는 함수가 필요하다. //여기서 2차원 배열을 돌려야한다.KEY!
//    public static int[][] rotation(int[][] matrix) {
//        int n = matrix.length; //행의 길이
//        int m = matrix[0].length; //열의 길이
//        int[][] new_matrix = new int[n][m]; //90도 돌린 key 변수!
//
//        for(int i=0 ; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                //90도를 돌려야한다.  //돌리면 열이 행이된다. //이때 역순으로 들어가기때문에 n(기존행) - i(현재행)-1을 해줘야 역순이된다. //0,0은 0,3이되고 1,0은 0,1이되고 2,2는 2,0이됨
//                new_matrix[j][n-i-1] = matrix[i][j];
//            }
//        }
//        return new_matrix;
//    }
//
//    //최종결과가 true와 false를 리턴하기때문에 자물쇠가 다 1인지 확인이 필요하다
//    public static boolean check(int[][] matrix) {
//        for(int i= matrix.length/3; i< (matrix.length/3)*2 ; i++) {
//            for (int j= matrix.length/3; j<(matrix[0].length/3)*2; i++) {  //(matrix.length/3)*2 는 lock을 3배키우고 중간에 넣었기때문에!
//                if(matrix[i][j] !=1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


