import java.util.*;
public class NumberPattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = s.nextInt();
        for(int i = 1;i<=n;i++){
            int count = 0;
            for(int j =1;j<=i;j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
