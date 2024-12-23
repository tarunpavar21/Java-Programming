import java.util.*;

public class sumofodd {
    public static int sumOfoddNum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 !=0){
                sum = sum+i;
                
            }
            
        }
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfoddNum(n);
        System.out.println(sum);
    }
}
