import java.util.Arrays;
import java.util.Scanner;

//  class Rohit{

//      static void checking(int[] arr){
//         Arrays.sort(arr);
//         for(int i = 0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
//     }





public class sortingarray {
    static int[] checking(int[] arr){
        Arrays.sort(arr);
        int ans[]= {arr[0], arr[arr.length -1]};
     
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array");
     for(int i = 0; i<n; i++){
        arr[i]= sc.nextInt();
     }
     int[] ans = checking(arr);
     System.out.println("Smallest "+ans[0]);
     System.out.println("Largest "+ans[1]);
    //  Rohit ob = new Rohit();
    //  checking(arr);
    //    System.out.println(checking(arr));
    }
}
    
