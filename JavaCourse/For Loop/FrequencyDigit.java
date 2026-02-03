import java.util.*;
public class FrequencyDigit {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        int digit = 0;
        int A[] = new int[10];
        for(;n>0;n/=10){
            digit = n%10;
            A[digit]++;
        }
        for(int i=0;i<10;i++){
            if(A[i]>0){
                System.out.println("Frequency of "+i+" is : "+A[i]);
            }
        }
    }
}
