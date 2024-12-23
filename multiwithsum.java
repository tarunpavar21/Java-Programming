import java.util.*;

public class multiwithsum {
    public static int multiplication(int a, int b){
        int multi = a*b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multiplication(a, b));
    }
    
}
