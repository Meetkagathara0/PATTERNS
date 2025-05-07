//     *    
//    * *   
//   *   *  
//  *     * 
// *********

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 3;   
        int width = (n * 2) + 1;
        int space1 = n;
        int space2 = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space1; j++) {
                System.out.print(" ");
            }
            space1--;

            System.err.print("*");

            if (space2 > 0) {
                for (int j = 1; j <= space2; j++) {
                    System.out.print(" ");
                }
                System.err.print("*");
            }

            space2 += 2;
            System.out.println();
        }

        for (int i = 1; i <= width; i++) {
            System.err.print("*");
        }
        System.out.println();
    }
}
