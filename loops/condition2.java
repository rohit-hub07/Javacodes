import java.util.Scanner;
class condition2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int ans = 0;
         int original_num = n;
         while(n>0){
         ans = ans*10 + n%10;
         n/=10;   // n = n/10

         }
         System.out.println("The reverse of the number "+ original_num+ " is "+ ans);
    }
}
