 import java.util.Scanner;
 
 
 class Functions2 {
      public static void factorialNum(int n){
        // if(n== 0){
        //     System.out.println(1);
        // }
        // int fac= factorialNum(n-1);
        // int b =n;
        // int factorial = b *fac;     
        // return factorial;
          if(n <0){
            System.out.println("invalid number");
            return;
          }
        int factorial = 1;
        for(int i = n; i>=1; i--){
             factorial = factorial * i;
        }
            System.out.println(factorial);
        
           return ;
        
        

      }
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        factorialNum(n);
      }
}
