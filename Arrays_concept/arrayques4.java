import java.util.Scanner;

class Rohit{
    public int countVariable(int[] arr,int x ){
        int count = -1;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==x){
                count = i;
                // System.out.print(count); 
            }
        }
         return count;
       
    }
}





public class arrayques4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sizee of the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array");

   for(int i = 0;i<n; i++){
    arr[i]= sc.nextInt();
   }
   System.out.println("Enter the number whose index you want to find");

    int x = sc.nextInt();
    Rohit ob = new Rohit();
    ob.countVariable(arr,x);
    System.out.println("The number occured last at index: " +ob.countVariable(arr,x));
  }
}
