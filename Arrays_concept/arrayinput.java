// package Arrays_concept;
import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
       int n = sc.nextInt();

    int[] array = new int[n];

    System.out.println("Enter the  " +n+ " elements");
    for(int i = 0; i<array.length; i++){
        array[i]= sc.nextInt();
    }
    for(int i = 0 ; i<n;i++){
        System.out.print(array[i]+ " ");
    }
    }
    
}
