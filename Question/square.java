import java.util.Scanner;


class square {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    // static void swap(int[] arr , int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j]= temp;
    // }
    // static void reverse(int[] arr ){
    //     int i =0;
    //     int j = arr.length;
    //     while(i<j){
    //         swap(arr,i,j);
    //         i++;
    //         j--;
    //     }        
    // }
    static int[] findinSquare(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        int[] ans = new int[n];
        int k = n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--] = arr[left]*arr[left];
                left++;
            }else{
                ans[k--]= arr[right]*arr[right];
                right--;
            }
        }
        return ans;
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
        int[] ans = findinSquare(arr);
      
        printArray(ans);

    }
    
}
