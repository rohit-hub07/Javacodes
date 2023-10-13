import java.util.Scanner;

class Function4 {
    public static void printTable(int n){
      for(int i =1; i<=10; i++){
        int tab = n *i;
        System.out.println(tab);
      }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
    }
}
