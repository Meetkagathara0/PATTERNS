// 1 
// 121 
// 1*3*1 
// 1**4**1 
// 1***5***1

public class NumberStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
