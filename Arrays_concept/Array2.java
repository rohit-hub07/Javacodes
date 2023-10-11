class Rohit{

void arrayMethod(){

    int[][] age = {{56,67,43},{42,54,9},{8,4,3}};
    
    // age[0] = 15;
    // age[1]= 56;
    // age[2]= 29;
    
    System.out.println(age[0][0]);
    System.out.println(age[0][1]);
    System.out.println(age[0][2]);

    System.out.println();

    System.out.println(age[1][0]);
    System.out.println(age[1][1]);
    System.out.println(age[1][2]);

    System.out.println();

    System.out.println(age[2][0]);
    System.out.println(age[2][1]);
    System.out.println(age[2][2]);
}
}

public class Array2 {
    public static void main(String[] args) {
       Rohit obj = new Rohit();
       obj.arrayMethod();
    }
}
