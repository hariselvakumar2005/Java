public class PrimeNumsArrays {
    public static void main(String args[]){
        int A[] = {3,4,5,6,7,1,2,8,9,10};
        for(int i = 0; i<A.length;i++){
            int count = 0;
            if(A[i] > 1){
                for(int j = 2;j<=A[i]/2;j++){
                    if(A[i]%j == 0){
                        count++;
                    }
                }
                if(count == 0){
                System.out.print(A[i] + " ");
            }
            }
        }
    }
}
