import java.util.Scanner;

class pointer{
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
               System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

       static void exchange(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;

          
       }
        static void Zeroesand1(int[] arr){
        int n = arr.length;
         int left = 0;
         int right = n-1;
         while(left<right){
            if(arr[left]==1&& arr[right]==0){
                exchange(arr, left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
         }
        }
    //    static void Zeroesand1(int[] arr){
    //     int n = arr.length;
    //     int zero =0;
    //     for(int i = 0; i<n;i++){
    //         if(arr[i]==0){
    //             zero++;
    //         }
    //     }
    //     for(int i = 0;i<arr.length;i++){
    //          if(i<zero){
    //             arr[i]=0;
    //          }else{
    //             arr[i] = 1;
    //          }
    //     }
    //    }
       

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array");
        for(int i= 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
           
        }
        System.out.println("Original array");
         printArray(arr);

          Zeroesand1(arr);
          System.out.println("Sorted array");
          printArray(arr);
    }
}