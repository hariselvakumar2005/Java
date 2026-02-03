import java.util.*;
public class Gcd {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = s.nextInt();
        System.out.println("Enter the second number:");
        int b = s.nextInt();
        for(;b != 0;){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}
