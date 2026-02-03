import java.util.*;
class Fibonacci {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series: ");
        for(int i = 1;i<=n;i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}