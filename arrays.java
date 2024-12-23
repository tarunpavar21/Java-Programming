import java.util.*;

public class arrays {
    public static void main(String[] args) {
        // int mark[] = {12,3,32};
        // int [] mark = new int[3];
        // mark[0]=98;
        // mark[1]=2;
        // mark[2]=3;
        //inpute array size 

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //taking input number 
        for(int i=0; i<size;i++){
            number[i]= sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
    
}
