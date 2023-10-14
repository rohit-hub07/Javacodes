import java.util.ArrayList;

class Wrapperclass {
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        // Float j = Float.valueOf(4.5f);
        // System.out.println(j);
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println(l1.get(1));
        System.out.println();

        // for(int i = 0; i<l1.size(); i++){
        //     System.out.println(l1.get(i));
        // }
        // System.out.println();

        System.out.println(l1);
        
        //adding a number in between an array list

        l1.add(1,100);
        System.out.println(l1);

            //modifying an array list

        l1.set(1,10);
        System.out.println(l1);
           
             //removing an element in an array list

             l1.remove(1);
             System.out.println(l1);

             //removing an e elemen twe don't know the element
              l1.remove(Integer.valueOf(7));
              System.out.println(l1);

              // check if an element exist in the array list

              boolean ans = l1.contains(Integer.valueOf(60));
              System.out.println(ans);

              // if we don't specify the class, you can put anything inside l
            //   ArrayList <> l = new ArrayList<>();
            //   l.add("pwiei");
            //   l.add(1);
            //   l.add(true);
            //   System.out.println(l);

              //This declaration is not working in vs code



    }
}
