import java.util.Scanner;

class Functions1 {
      public static int sumNum(int a, int b){
        int sum = a+b;
       
        return sum;
      }
      public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumNum(a,b);
        System.out.println(sum);

      }
}
