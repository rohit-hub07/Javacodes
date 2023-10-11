import java.util.Scanner;


// public class method1 {
//      public static void Sumof_num(int a, int b){
//           int sum = a + b;
//           System.out.println(sum);
//           return;
//      }
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // int sum = a + b;
//         Sumof_num(a,b);
//      }
// }


                //    2nd approach 

  class Rohit {
    int add(int a , int b){
    int ans = a + b;
    return ans;
    }

    public class method1 {
        public static void main(String[] args) {
            Rohit obj = new Rohit();

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("THe sum of two numbers is ");
            int ans = obj.add(x,y);
            System.out.println(ans);
        }
    }
  }              


