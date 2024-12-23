import java.util.*;

public class circleradius {
    public static float getCircumference(float r){
        float circumference = (float) (2* 3.14 * r);
        return circumference;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    float circumference = getCircumference(r);
    System.out.println("circumference of circle :"+ circumference);
  }  
    
}
