import java.util.Scanner;


class pascaltri {
    static void printArray(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j]!=0){
                System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i = 0; i<n; i++){
            ans[i] = new int[n];

            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the elements");
        int n = sc.nextInt();
       int[][] ans = pascal(n);
       printArray(ans);


    }
    
}
