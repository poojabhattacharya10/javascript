import java.util.Scanner;

public class IntersectionOfTwoArrays {
    static void intersections(int[] ar1 , int[] ar2){
        for(int i = 0 ; i < ar1.length ; i++){
            for(int j = 0 ; j < ar2.length ; j++){
                if(ar1[i] == ar2[j]){
                    System.out.println(ar1[i]+" ");
                    ar2[j] = -9999999;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar1[] = new int[n];
        for(int i = 0 ; i < ar1.length ; i++){
            ar1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int ar2[] = new int[m];
        for(int i = 0 ; i < ar2.length ; i++){
            ar2[i] = sc.nextInt();
        }
        intersections(ar1 , ar2);
        sc.close();
    }
}
