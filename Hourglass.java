// *********
//  *     * 
//   *   *  
//    * *   
//     *    
//    * *   
//   *   *  
//  *     * 
// *********

public class Hourglass {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - 2 * i; j++) {
                if (j == 0 || j == size - 2 * i - 1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - 2 * i; j++) {
                if (j == 0 || j == size - 2 * i - 1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
