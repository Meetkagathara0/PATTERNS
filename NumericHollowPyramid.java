//     1    
//    1 2   
//   1   3  
//  1     4 
// 1 2 3 4 5

public class NumericHollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            space--;
            System.out.print("1");
            if (i > 1) {
                for (int p = 1; p <= 2 * (i - 1) - 1; p++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" " );
        }
    }
}
