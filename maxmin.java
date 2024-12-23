import java.util.*;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();

        int number[] = new int[size];

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();

        }

        // for finding max min read the value:

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        //output

        for(int i=0; i<number.length;i++){
            if(number[i]<min){
                min = number[i];


            }
            if(number[i]>max){
                max = number[i];

            }
        }
        System.out.println("larget number " + max);
        System.out.println("smallest number "+ min);


    }
    
}
