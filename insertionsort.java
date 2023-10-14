import java.util.Scanner; 
 
 
 class insertionsort {
    public static void main(String args[]){
        int[] a ={23,45,2,20,15};
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] a = new int[size];
       int temp;
       int j;
        for(int i =1;i<a.length;i++){
            temp= a[i];
            j =i;
            while(j>0 && a[j-1]>temp ){
              a[j]= a[j-1];
              j = j-1;
            }
            a[j]= temp;
        }
        for(int i = 1; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
