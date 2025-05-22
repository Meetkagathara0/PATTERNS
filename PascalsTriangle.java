//      1      
//     1 1     
//    1 2 1    
//   1 3 3 1   
//  1 4 6 4 1  


public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        int[][] triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int s = n - i; s > 1; s--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
