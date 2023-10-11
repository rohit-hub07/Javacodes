//printing odd and even given in a order
import java.util.Scanner; 

class printingoddandEven {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    static void oddEven(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n -1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
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
            System.out.println("Original array");
            printArray(arr);
            oddEven(arr);
              System.out.println("Sorted array");
              printArray(arr);


            
    }
}
