import java.util.*;
public class AmicableNumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = s.nextInt();
        System.out.print("Enter the second number : ");
        int b = s.nextInt();
        int fA = 0;
        int fB = 0;
        for(int i = 1;i<=a/2;i++){
            if(a%i==0){
                fA += i;
            }
        }
        for(int j = 1;j<=b/2;j++){
            if(b%j==0){
                fB += j;
            }
        }
        if(fA==b && fB==a){
            System.out.println(a+" and "+b+" are amicable numbers.");
        }
        else{
            System.out.println(a+" and "+b+" are not amicable numbers.");
        }
    }
}
