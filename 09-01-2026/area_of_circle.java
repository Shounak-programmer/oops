import java.util.*;
public class area_of_circle {
    public static void main(String args[]){
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner (System.in);
        double r;
        r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of the circle is: "+area);
        sc.close();
    }
}
