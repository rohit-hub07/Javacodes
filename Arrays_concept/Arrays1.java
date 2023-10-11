// package Arrays_concept;


class Rohit{

    void callarr(){

        int[][] age = {{56,67,43},{42,54,9},{8,4,3}};
             
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3; j++){
                System.out.println(age[i][j]);
            }
            System.out.println();
        }
        // System.out.println(age[0][0]);
        //  System.out.println(age[0][1]);
        //   System.out.println(age[0][2]);
    }

void arrayMethod(){

    int[] age = new int[3];
    System.out.println("the length of the array is : " +age.length);
    System.out.println();
    age[0] = 15;
    age[1]= 56;
    age[2]= 29;
    
    System.out.println(age[0]);
    System.out.println(age[1]);
    System.out.println(age[2]);
}
}

public class Arrays1 {
    public static void main(String[] args) {
       Rohit obj = new Rohit();
       obj.callarr();
    //    System.out.println();

    //    obj.arrayMethod();
    }
}




