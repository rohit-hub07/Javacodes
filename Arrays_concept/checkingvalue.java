import java.util.Scanner;

class Rohit{

    boolean checking(int[] arr){
        boolean check = true;
        // int check = true;
        for(int i = 1; i<arr.length; i++){
              if(arr[i]<arr[i-1]){
                check = false;
                break;
              }
        }
        return check;
    }
}




public class checkingvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
        arr[i]= sc.nextInt();
     }
        Rohit ob = new Rohit();
         ob.checking(arr);
          System.out.println(ob.checking(arr));
    }
}
