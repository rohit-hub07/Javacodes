public class printsumofarray {

 
    static int sum(int[] arr, int target){
        int n = arr.length;
        int count = 0;
        for( int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j +1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==12){
                        count++;

                    }
                }
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        int arr[]= {1,3,4,5,6,};
        int target = 12;
        System.out.println(sum(arr,target));
        
    }
    
}
