// package Arrays_concept;
import java.util.Scanner;

class Rohit{

     static void returnIndex(){
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,1,6};

        int x = sc.nextInt();
        int ans = -1;

        for(int i = 0; i<arr.length; i++){
             if(arr[i]== x){
           ans = i;
           break;
          }
        }
    
            if(ans == -1){
                System.out.println("The number is not in the array" +ans);
            }
            else{
            System.out.println(ans);
            }
    }

   
    static  void lararray(){
    int[] arr = { 4,3,6,5,7,9};

    int ans =0;
    for(int i = 0 ; i<arr.length; i++){
        if(arr[i]>ans){
            ans = arr[i];
        }
           
        
    }
            System.out.println("The largest number is : " +ans);
      
    
    }
}




public class ararysques {
    public static void main(String[] args) {
        Rohit obj = new Rohit();
        // obj.lararray();
        // System.out.println();
        


        // System.out.println();


        // System.out.println();


        obj.returnIndex();
    }
}

