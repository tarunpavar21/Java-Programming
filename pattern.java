import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        

        // for(int i=0; i < n; i++){
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //        System.out.println();
        // }

        //holo ractangle 

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || j==1 || i==n || j==m ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // half peramid

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }


        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        //inverted pyramid

        // for(int i=1; i<=n; i++){

        //     // space loop 
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //for loop for inner star
        //     for(int j=1; j<=i; j++){        
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

            // number patern print

            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }


            //inverted number 

            // for(int i=1; i<=n; i++){
            //         for(int j=1; j<=n-i+1; j++){
            //             System.out.print(j);
            //         }
            //         System.out.println();
            //     }


            // 1 to 15 number print pyramid

            // int number = 1;
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print(number+" ");
            //         number++;
            //     }
            //     System.out.println();
            // }

            // 01 triangle

            // for(int i = 0; i<=n; i++){
            //     for(int j=1; j<=i; j++){
            //         int sum = i+j;
            //         if(sum %2 == 0){
            //             System.out.print("1 ");
            //         }else{
            //             System.out.print("0 ");}
            //     }
            //     System.out.println();
            // }



    }
}
