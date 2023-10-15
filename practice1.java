 import java.util.Scanner;
 
 class practice1 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number= new int[size];

        for(int i = 0; i<size; i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for(int i = 0; i<size;i++){
            if(x==number[i]){
                System.out.println("x is at index " +i);
            }
        }
    }
}
