//     1    
//    121   
//   12321  
//  1234321 
// 123454321


public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        int n = 6;
        int temp = n;

        for(int i=1; i<=n; i++){
            for(int j=temp; j>1; j--){
                System.out.print(" ");
            }
            temp--;
            for(int k=1; k<=i; k++){
                System.err.print(k);
            }
            for(int k=i-1; k>=1; k--){
                if(i!=1) System.out.print(k);
            }
            System.out.println();
        }
    }
}
