import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int p = 0;
        int temp = n;
        for(;n>0;n/=10){
            p++;
        }
        n = temp;
        int sum = 0;
        for(;n>0;n/=10){
            sum += (int)(Math.pow((n%10),p));
        }
        if(temp == sum){
            System.out.println(temp + " is an Armstrong Number");
        }
        else{
            System.out.println(temp + " is not an Armstrong Number");
        }
    }
}
