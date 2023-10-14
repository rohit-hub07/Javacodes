import java.util.Scanner;

class Printingsum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number which you want whose sum you want to print");
    int n = sc.nextInt();
    int ans = 0;
    while(ans<=n){
        ans = n*(n+1)/2;
        
    }
    System.out.println("The sum of number is : ");
    System.out.println(ans);
    
   } 
    
}