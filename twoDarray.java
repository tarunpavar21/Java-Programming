import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // declaration of array

        int[][] number = new int[rows][cols];

        //input rows and cols

        for(int i=0; i<rows; i++){
            for( int j=0; j<cols; j++){
                number[i] [j]= sc.nextInt();


            }
            
        }
        //output
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                System.out.print(number[i][j] +" ");
            }
            System.out.println();
        }
        
    }
    
}
