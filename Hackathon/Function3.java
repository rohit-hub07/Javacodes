import java.util.Scanner;

class Function3 {
     public static void printPrime(int n){
        if(n % 2 == 0){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
        return;
        
     }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
     }
}
