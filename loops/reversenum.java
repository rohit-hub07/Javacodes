import java.util.Scanner;

class reversenum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int num = n;

        while(n>0){
            ans = ans * 10 + n %10;
            n/=10;

        }
        System.out.println("The reverse of the number " + num + " "+ ans );
    }
}
