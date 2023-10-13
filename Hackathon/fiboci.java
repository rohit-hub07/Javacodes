 class fiboci {
     
    public static int finiciNum(int n){
        if(n==0|| n==1){
            return n;
        }
        int a = finiciNum(n-1);
        int b = finiciNum(n-2);
        int finici = a+b;
        return finici;
    }
    public static void main(String args[]){
        for(int i = 0; i<=5; i++){
       System.out.println(finiciNum(i));
    }
}
}
//   public static int fibinac(int n){
//            if(n == 0 || n == 1){
//             return n;
//            }

//         int previous1 = fibinac(n -1);
//         int previous2 = fibinac(n -2);
//         int fibinac = previous1 + previous2;
//         return fibinac;

//      }