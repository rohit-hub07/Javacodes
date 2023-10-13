 import java.util.Scanner;
 
 
 class odd {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int total = 0;
        for(int i = 1; i<=n; i+= 2){
           int  sum =total +i;
            System.out.println(sum);
        }
       
        
     }

    }