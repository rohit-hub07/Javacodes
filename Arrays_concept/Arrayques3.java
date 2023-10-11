import java.util.Scanner;

class Rohit{
    public int countVariable(int[] arr,int x ){
        int count = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==x){
                count++;
               
            }
        }
        return count;
    }
}





public class Arrayques3{

               //Calling without making any class and can be called directly without making a obeject

  static int countVariable(int[] arr,int x ){
        int count = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==x){
                count++;
               
            }
        }
        return count;
    }

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array");
    for(int i =0 ;i<n; i++){
      arr[i] = sc.nextInt();
    }
     System.out.println("Enter the number which you want to count");
    int x = sc.nextInt();

    Rohit ob = new Rohit();
    ob.countVariable(arr,x);
    System.out.println("The count of the number in the array is : " +ob.countVariable(arr,x));

         
    // countVariable(arr,x);
  }
}