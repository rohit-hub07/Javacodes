import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        while(n>0){
            sum += n %10;
           
         
           n/=10;
        }
        System.out.println("The sum of numebrs " +num+ " " + sum);
    }
}
