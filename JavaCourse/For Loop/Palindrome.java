import java.util.*;

public class Palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        int temp = n;
        int rev = 0;
        for(;n>0;n/=10){
            rev = (rev*10) + (n%10);
        }
       if(rev == temp){
           System.out.println(temp + " is a Palindrome number");
         } 
         else {
            System.out.println(temp + " is not a Palindrome number");
         }
    }
}
