import java.util.*;
public class PrimeNumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = s.nextInt();
        for(int i = 1; i<=n;i++){
            int count = 0;
            if(i>1){
                for(int j = 2; j<=i/2;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
