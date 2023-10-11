import java.util.Scanner;

class Addition2Darray{
    static void printArray(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void sumArray(int[][] arr, int a,int b, int[][] arr1,int c , int d){
        if(a!=c|| b!=d){
            System.out.println("Addition not possible");
            return;
        }
        int[][] sum = new int[a][b];
        for(int i = 0;i<a;i++){
            for(int j =0; j<b; j++){
                sum[i][j] = arr[i][j] +arr1[i][j];
            }
        }
        printArray(sum);
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
          sumArray(arr,a,b,arr1,c,d);
          sc.close();

    }
}






// import java.util.Scanner;

// class Addition2Darray {
//     static void printArray(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//     }

//     static void sumArray(int[][] arr, int a, int b, int[][] arr1, int c, int d) {
//         if (a != c || b != d) { // Fixed the condition here
//             System.out.println("Addition not possible");
//             return; // Exit the method if addition is not possible
//         }
//         int[][] sum = new int[a][b];
//         for (int i = 0; i < a; i++) { // Fixed the loop index here
//             for (int j = 0; j < b; j++) {
//                 sum[i][j] = arr[i][j] + arr1[i][j];
//             }
//         }
//         printArray(sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the rows");
//         int a = sc.nextInt();
//         System.out.println("Enter the size of the cols");
//         int b = sc.nextInt();
//         System.out.println("Enter the array");

//         int[][] arr = new int[a][b];
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         printArray(arr);

//         System.out.println("Enter the size of the rows of the 2nd array");
//         int c = sc.nextInt();
//         System.out.println("Enter the cols of the 2nd array");
//         int d = sc.nextInt();

//         System.out.println("Enter the 2nd array");
//         int[][] arr1 = new int[c][d];
//         for (int i = 0; i < c; i++) {
//             for (int j = 0; j < d; j++) {
//                 arr1[i][j] = sc.nextInt();
//             }
//         }
//         printArray(arr1);
//         sumArray(arr, a, b, arr1, c, d);

//         sc.close(); // Close the scanner at the end
//     }
// }
