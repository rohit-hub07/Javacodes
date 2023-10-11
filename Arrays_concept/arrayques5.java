public class arrayques5 {

   static int sum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                 ans++;
                }
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,5,4,1};
        int target = 7;
          
        System.out.println(sum(arr, target));
}
}