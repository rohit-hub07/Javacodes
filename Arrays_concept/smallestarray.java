// Incomplete code of finding 2nd smallest number of the given array

import java.util.Scanner;

public class smallestarray {


    static int print2ndsmallest(int[] arr){
        int n = arr.length;
        // int secondsmall = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n;j++){
                if(arr[i]>arr[j]){
                  return arr[j];
                }
            }
        }
       


        static int printsmall(int[] arr){
            int m = print2ndsmallest(arr);
            arr[j] = Integer_max;
            for(int i = 0; i<arr.length;i++){
                for(int j = i+1; j<arr.length;j++){
                    if(arr[i]== arr[j]) {
                        arr[j] = Integer.max;

                    }
                }
            }
            int secondsmall = print2smallest(arr);
             return secondsmall;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(print2ndsmallest(arr));
    }
}
