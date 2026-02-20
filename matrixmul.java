public class matrixmul {

    public static void main(String[] args) {
        int[][] a = { {17 , 14}, {2,9} };
        int[][] b = { {9,2} , {7,1} };
        int[][] c = {{0,0},{0,0}};
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
  
        System.out.println("c : ");
       for(int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }


}