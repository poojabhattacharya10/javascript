import java.util.Scanner;

/**
 * FindUnique
 */
public class FindUnique {

    // static int findUnique(int[] arr) {
    //     int i , j , c;
    //     for(i = 0 ; i < arr.length ; i++){
    //         c = 0;
    //         for(j = 0 ; j < arr.length ; j++){
    //             if(arr[i] == arr[j]){
    //                 c++;
    //             }
    //         }
    //         if(c == 1){
    //             return arr[i];
    //         }
    //     }
    //     return 0;
    // }

    static int[] findUnique(int[] arr) {
        int i , j , c , k = 0;
        int a[] = new int [arr.length];
        for(i = 0 ; i < arr.length ; i++){
            c = 0;
            for(j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c == 1){
                a[k] = arr[i];
                k++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(findUnique(arr));
        int ar[] = findUnique(arr);
        for(int i = 0 ; i < ar.length ; i++){
            System.out.println(ar[i]);
        }
        sc.close();
    }

}