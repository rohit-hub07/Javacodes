import java.util.Scanner;

class preffix {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      static int[] preffixSum(int[] arr){
        int n = arr.length;
        int[] preffix = new int[n];
         preffix[0]= arr[0];
         for(int i = 1;i<n;i++){
            preffix[i] = preffix[i-1]+arr[i];
         }
         return preffix;
      }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);
        int[] preffix = preffixSum(arr);
        System.out.println("Array after adding preffix");
      
        printArray(preffix);

    }
}
