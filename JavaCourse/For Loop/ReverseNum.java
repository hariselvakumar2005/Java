import java.util.*;

public class ReverseNum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        int rev = 0;
        for(;n>0;n/=10){
            rev = (rev*10) + (n%10);
        }
        System.out.println("The Reversed Number is : " + rev);
    }
}
