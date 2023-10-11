import java.util.Scanner;

class multiply2darray{
    static void printArray(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void mulArray(int[][] arr, int a,int b, int[][] arr1,int c , int d){
        if(b!=c){
            System.out.println("multiplication not possible");
            return;
        }
        int[][] mul = new int[a][d];
        for(int i = 0;i<a;i++){
            for(int j =0; j<b; j++){
                for(int k = 0; k<a;k++){
                   mul[i][j] += arr[i][k]*arr1[k][j];
                }
                
            }
        }
        printArray(mul);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the rows");
      int a = sc.nextInt();
      System.out.println("Enter the size of the cols");
      int b = sc.nextInt();
      System.out.println("Enter the array");

      int[][] arr = new int[a][b];
      for(int i = 0;i < a; i++){
        for(int j = 0; j < b; j++){
            arr[i][j] = sc.nextInt();
        }
           
      }
      System.out.println();
         printArray(arr);
         System.out.println("Enter the size of the rows of 2nd array");
         int c = sc.nextInt();
         System.out.println("Enter the cols of 2nd array");
         int d = sc.nextInt();
       
        System.out.println("Enter the array");
         int[][] arr1 = new int[c][d];
         for(int i = 0;i<c; i++){
          for(int j = 0; j<c; j++){
            arr1[i][j] = sc.nextInt();
            }
            // System.out.println();
       }
       System.out.println();
          printArray(arr1);
          mulArray(arr,a,b,arr1,c,d);
          sc.close();

    }
}
