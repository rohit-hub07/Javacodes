                                //Incomplete code have to try this kind of concepts more and practice more 
                                



import java.util.Scanner;

class preffixSum2D {
    static void printArray(int[][] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j= 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
      static int sum2d(int [][] arr, int l1, int r1, int l2, int r2){
        int[][] sum = new int[l1][r2];

        for(int i =l1; i< r2; i++){
          sum += a[i][r2]- arr[i][r2-1];
          }

            for(int j = r1; j<l2; j++){
                sum += a[j][l2]- arr[j][l2-1];
            }
        }
        return sum;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of cols");
        int c = sc.nextInt();
        System.out.println("Enter the array");
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        printArray(arr);
        System.out.println("Enter rectangle boundaries");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int result = sum2d(arr, l1, r1, l2, r2);
        System.out.println(result);
        
       




    }
    
}

