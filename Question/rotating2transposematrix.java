import java.util.Scanner;

class rotating2transposematrix{
    static void printArray(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }      
       
        static int[][] Transpose(int[][] arr, int a, int b){
            int[][] trans = new int[b][a];
            for(int i = 0; i<b; i++){
                for(int j =0; j<a; j++){
                    trans[j][i] = arr[i][j];
                }
            }
            System.out.println();
            printArray(trans);
            return trans;
          
        }
           
     
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int a = sc.nextInt();
        System.out.println("Enter the size of the cols");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter the array");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        System.out.println();
        
        Transpose(arr, a, b);



    }
}