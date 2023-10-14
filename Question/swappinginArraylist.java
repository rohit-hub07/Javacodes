import java.util.ArrayList;
// import java.util.Collection;

class swappinginArraylist{
static void reverList(ArrayList <Integer> list){}

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    System.out.println("Original List " + list);
    reverList(list);
    System.out.println("Reversed Array " + list);

}
}
