 import java.util.Scanner;

class transposeofmatrix{
    static void printArray(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] transpose(int[][] arr, int a, int b){
       
        int[][] trans = new int[b][a];
        for(int i= 0 ; i<a; i++){
            for(int j =0; j<b; j++){
                trans[j][i] = arr[i][j];
              
            }

        }
        return trans;
        
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

        // transpose(arr,a,b);
        int[][] trans= transpose(arr,a,b); 
        printArray(trans);

    }
}
