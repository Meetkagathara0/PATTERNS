//     *    
//    * *   
//   *   *  
//  *     * 
// *       *
//  *     * 
//   *   *  
//    * *   
//     *    

public class HollowDiamondPatter{
    public static void main(String[] args) {
        int space = 5;
        int space2 = 1;
        for(int i=1; i<=5; i++){
            for(int s=space; s>=1; s--){
                System.out.print(" ");
            }
            space-=1;
            for(int j=1; j<=1; j++){
                System.err.print("*");
            }
            if(i==1){
                System.out.print("");
            }
            else{
                for(int s=1; s<=space2; s++){
                    System.out.print(" ");
                }
                space2+=2;
                for(int j=1; j<=1; j++){
                        System.err.print("*");
                }
            }
            System.out.println();
        }
        int temp = 1;
        int temp2 = 5;
        for(int i=1; i<=4; i++){
            for(int s=1; s<=temp+1; s++){
                System.out.print(" ");
            }
            ++temp;
            for(int j=1; j<=1; j++){
                    System.err.print("*");
            }
            if(temp2>=1){
                for(int s=temp2; s>=1; s--){
                    System.out.print(" ");
                }
                temp2-=2;
                for(int j=1; j<=1; j++){
                    System.err.print("*");
                }
            }
            System.out.println();
        }
    }
}
