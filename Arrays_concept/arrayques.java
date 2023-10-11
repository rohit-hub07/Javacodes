// package Arrays_concept;
 class Rohit{

    void arrQues(){

        int[] arr_1 = { 1,5,3};
        int sum =0;
        // int sum = arr_1[0]+ arr_1[1]+ arr_1[2];
        for(int i = 0; i<3; i++){
            int a = arr_1[i];
             sum = sum + a;
       

        }
             System.out.println("The sum of the numbers is : " +sum);
        // System.out.println("The sum of the numbers is : " + sum);
        }
 }







public class arrayques {

    static void rohit(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i= 0; i<n; i++){
            
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        // rohit(arr);
        Rohit obj = new Rohit();
        obj.arrQues();
    }
}
