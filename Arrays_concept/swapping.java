public class swapping {

    //Finding the reverse order of the given array 

        static void swapInArray(int[] arr, int i, int j ){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
        }
    static void reversingArray(int[] arr){
        int n = arr.length;

      
        // for(int i = 0; i<n; i++){
        //     int j = n -1; 
        //     int j >= 0;
        //    swapInArray(arr,i,j);
      
        // }
        int i = 0, j =arr.length - 1;

        while(i<j){
            swapInArray(arr , i, j);
            i++;
            j--;
        }
    }

    static int[] findingNumberbackwards(int[]arr){
         int n = arr.length;
         int[] ans = new int[n];
          int j = 0;
           for(int i =n-1; i>=0; i--){
               ans[j++] = arr[i];
           }
           return ans;
    }
           static void printArray(int[] arr){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
           }

               //This is for swapping of 2 numebers without using any 3rd variable
       
               static void swapWithout(int a, int b){
        System.out.println("Value before swapping");
        System.out.println("Value of a before swapping " +a);
        System.out.println("Value of b before swapping :" +b);
        a = b+a;  // a = 4; b =8
        b = a-b;  // b =4; a = 12
        a =  a-b;// b= 4
        System.out.println("Value after swapping");

        System.out.println("value of a after swapping :" +a);

        System.out.println("VAlue of b after swapping :" +b);
    }



           //Swapping of 2 numbers using a 3rd variable
      static void swap(int a, int b){
        System.out.println("original value");
        System.out.println(a);
        System.out.println(b);

        System.out.println("Value after swapping");

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    

    public static void main(String[] args) {
        // int a =4;
        // int b = 8;
        // // swap(a,b);
        // swapWithout(a,b);

                  //Swapping 1st method

         int[] arr = {1,2,3,4,5}; 
        //  int[] ans = findingNumberbackwards(arr);
        //  printArray(ans);

                     //swapping 2nd method

      reversingArray(arr);
      printArray(arr);


    }
}
