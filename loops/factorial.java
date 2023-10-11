import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        
        for(int i = 1; i<=n ; i++){
            
             b = b * i;
            
             System.out.println(" Factorial "+ i+ " : "+ b);
        }
         
       
        
        
      
    }
}

