import java.util.*;
public class DigitsOfNum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            for (; n > 0; n /= 10) {
                count++;
            }
        }
        System.out.println("Number of digits : " + count);
    }
}
