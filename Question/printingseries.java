import java.util.Scanner;

class printingseries {

    static void printArray(int[][] arr){
        for(int i= 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; i++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Array(int[][] arr,int r, int c){
        int leftrow = 0;
        int leftcol = 0; 
        int rightcols= c-1;
        int buttomrow = r-1;
        int totalelements = 0;

        while(totalelements<r*c){

            for(int j = leftcol; j<rightcols; j++){
                System.out.println(arr[leftrow][j]);
                leftrow++;
                totalelements++;
            }

              for(int j = leftrow; j<buttomrow; j++){
                System.out.println(arr[leftcol][j]);
                leftcol++;
                totalelements++;
            }
             for(int j = rightcols; j>=leftrow; j--){
                System.out.println(arr[buttomrow][j]);
                buttomrow--;
                totalelements++;
            }
            for(int j = buttomrow ; j>=leftrow; j--){
                System.out.println(arr[rightcols][j]);
                rightcols--;
                totalelements++;
            }
        }
        // printArray(Array);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt(); 
        System.out.println("Enter the number of cols");
         int c = sc.nextInt(); 
        System.out.println("Enter the array");
        int[][] arr = new int[r][c];

        for(int i =0; i<r; i++){
            for(int j = 0; j<c; j++){
              arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);


       
        Array(arr,r,c);

    }
  
}
