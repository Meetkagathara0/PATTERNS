// 1 2 3
// 8 9 4
// 7 6 5

// 1   2   3   4   5
// 16  17  18  19  6
// 15  24  25  20  7
// 14  23  22  21  8
// 13  12  11  10  9

public class NumberSpiral {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            // → left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // ↓ top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // ← right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // ↑ bottom to top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
