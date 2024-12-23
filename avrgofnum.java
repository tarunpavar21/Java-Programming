import java.util.*;

public class avrgofnum {
    public static int avgNum(int a, int b, int c){
        int avg = (a +b+c)/3;
        return avg;



    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("print the avg of three num="+ avgNum(a, b, c));
    }

    
}
