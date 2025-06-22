//          *       
//         * *      
//        *   *     
//       * * * *    
//      *       *   
//     * *     * *  
//    *   *   *   * 
//   * * * * * * * *

public class SierpinskiTriangle_simple {
    static void printSierpinski(int n) {
        for (int y = n - 1; y >= 0; y--) {

            for (int i = 0; i < y; i++) System.out.print(" ");
            for (int x = 0; x + y < n; x++) {
                if ((x & y) != 0) System.out.print(" " + " ");
                else System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        {
            int n = 8;
            printSierpinski(n);
        }
    }
}
