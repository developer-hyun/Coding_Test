public class Adjacency_Matrix {

    public static int INF = 99999;

    public static int[][] matrix  = {{0,5,7},{1,5,INF},{3,5,INF} };


    public static void main(String[] args) {

    for (int i=0 ; i < 3 ; i ++) {
        for (int j=0 ; j <3 ; j++) {
            System.out.println(matrix[i][j] + " ");
        }
        System.out.println();
    }


    }
}
