 import java.util.Scanner;

 class Digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitnum = 0;
        int original_num=n;
        
        
        while(n >0){

            
            
            
            n /= 10;
            digitnum++;
        }
        System.out.println(" No of digits are " + original_num + " " + digitnum );
          
    }
 }