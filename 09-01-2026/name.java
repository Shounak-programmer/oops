import java.util.*;
public class name {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String s;
       System.out.println("Enter your name: ");
       s = sc.nextLine();
       for (int i = 1 ; i <= 10 ; i++)
        {
          System.out.println(s);
        } 
       sc.close();
    }
}
