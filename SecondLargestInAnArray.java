import java.util.Scanner;
/**
 * SecondLargestInAnArray
 */
public class SecondLargestInAnArray {
    static int secondLargest(int[] arr , int n){
        int max = arr[0];
        int MIN_VALUE = -2147483648;
        for(int i = 1 ; i < n ; i++){
            
            if(max < arr[i]){
                MIN_VALUE = max;
                max = arr[i]; 
            }
            else if(MIN_VALUE < arr[i] && arr[i]!=max){
                MIN_VALUE = arr[i];
            }

        }
        return MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int ans = secondLargest(arr , n);
        System.out.println(ans);
        sc.close();
    }
}