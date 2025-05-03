//     A    
//    ABA   
//   ABCBA  
//  ABCDCBA 
// ABCDEDCBA


public class AlphabetDiamond {
    public static void main(String[] args) {
        char alpha = 'A';
        int space = 4;
        for(int i=1; i<=5; i++){
            for(int s=space; s>=1; s--){
                System.out.print(" ");
            }
            for(int f=1; f<=i; f++){
                System.out.print(alpha);
                alpha+=1;
            }
            alpha-=1;
            for(int f=1; f<=i-1; f++){
                alpha-=1;
                System.out.print(alpha);
            }
            space-=1;
            System.out.println(" ");
        }
    }
}
