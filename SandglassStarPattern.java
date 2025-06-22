// *********
//  ******* 
//   *****  
//    ***   
//     *    
//    ***   
//   *****  
//  ******* 
// *********

public class SandglassStarPattern {
    public static void main(String[] args) {
        int n = 7;
        int n1 = (n * 2) - 1;
        int space = n;
        int temp = 1;

        for (int i = 1; i <= n; i++) {
            if (i != n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= n1; k++) {
                    System.out.print("*");
                }
                n1 -= 2;
                System.out.println();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            space--;
            for (int k = 1; k <= temp; k++) {
                System.out.print("*");
            }
            temp += 2;
            System.out.println();
        }
    }
}
