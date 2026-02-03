import java.util.*;
class Numprint{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        for(int i = 1;i<=n;i++){
            if(i!=n){
               System.out.print(i + ","); 
            }
            else{
                System.out.print(i + ".");
            }
        }
    }
}