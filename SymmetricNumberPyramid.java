//     1    
//    2 2   
//   3   3  
//  4     4 
// 5       5
//6 6 6 6 6 6

public class SymmetricNumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int space1 = -1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            space--;
            for (int k = i; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = 1; j <= space1; j++) {
                if (i == 1) {
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            space1 += 2;
            for (int k = i; k <= i; k++) {
                if (i == 1) {
                    break;
                } else {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(n + " ");
        }
    }
}
