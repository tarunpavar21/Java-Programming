import java.util.*;

public class name{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String name[] = new String[size];

        //input 
        for(int i=0; i<size; i++){
            //input as name 
            name[i] = sc.next();

        }
        // output 
        for(int i=0; i<name.length;i++){
            System.out.println("name " +(i+1) +"is:"+name[i]);
        }

    }
}