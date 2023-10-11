import java.util.Scanner;

public class printarray {

 
    static int sum(int[] arr){
        int n = arr.length;
        // int count = -1;
        for( int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
              if(arr[i]== arr[j]){
                 return arr[i];
                 }
            }
        }
        // System.out.println("There is no repeating number");
        return -1;
    
       
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ener the array");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println("");
        // int target = 12;
        System.out.println("The repeating number is " +sum(arr));
        
    }
    
}
