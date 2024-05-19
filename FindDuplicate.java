import java.util.Scanner;

public class FindDuplicate {
    // static int duplicateNumber(int[] arr){
    //     for(int i = 0 ; i < arr.length ; i++){
    //         int c = -1;
    //         for(int j = 0 ; j < arr.length ; j++){
    //             if(arr[i] == arr[j]){
    //                 c++;
    //             }
    //         }
    //         if(c > 0){
    //             return arr[i];
    //         }
    //     }
    //     return 0;
    // }

    static int[] duplicateNumber(int[] arr){
        int ar1[] = new int[arr.length]; 
        int k = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int c = -1;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c > 0){   
                ar1[k] = arr[i];
                k++;
            }
        }
        return ar1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(duplicateNumber(arr));
        int ans[] = duplicateNumber(arr);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
        sc.close();
    }
}
