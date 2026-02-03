import java.util.*;
public class NumPattern2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        int count = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
